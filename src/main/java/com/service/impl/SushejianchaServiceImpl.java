package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.SushejianchaDao;
import com.entity.SushejianchaEntity;
import com.service.SushejianchaService;
import com.entity.vo.SushejianchaVO;
import com.entity.view.SushejianchaView;

@Service("sushejianchaService")
public class SushejianchaServiceImpl extends ServiceImpl<SushejianchaDao, SushejianchaEntity> implements SushejianchaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SushejianchaEntity> page = this.selectPage(
                new Query<SushejianchaEntity>(params).getPage(),
                new EntityWrapper<SushejianchaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SushejianchaEntity> wrapper) {
		  Page<SushejianchaView> page =new Query<SushejianchaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SushejianchaVO> selectListVO(Wrapper<SushejianchaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SushejianchaVO selectVO(Wrapper<SushejianchaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SushejianchaView> selectListView(Wrapper<SushejianchaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SushejianchaView selectView(Wrapper<SushejianchaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
