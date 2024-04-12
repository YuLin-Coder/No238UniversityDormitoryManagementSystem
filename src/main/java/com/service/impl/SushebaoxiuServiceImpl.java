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


import com.dao.SushebaoxiuDao;
import com.entity.SushebaoxiuEntity;
import com.service.SushebaoxiuService;
import com.entity.vo.SushebaoxiuVO;
import com.entity.view.SushebaoxiuView;

@Service("sushebaoxiuService")
public class SushebaoxiuServiceImpl extends ServiceImpl<SushebaoxiuDao, SushebaoxiuEntity> implements SushebaoxiuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SushebaoxiuEntity> page = this.selectPage(
                new Query<SushebaoxiuEntity>(params).getPage(),
                new EntityWrapper<SushebaoxiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SushebaoxiuEntity> wrapper) {
		  Page<SushebaoxiuView> page =new Query<SushebaoxiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SushebaoxiuVO> selectListVO(Wrapper<SushebaoxiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SushebaoxiuVO selectVO(Wrapper<SushebaoxiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SushebaoxiuView> selectListView(Wrapper<SushebaoxiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SushebaoxiuView selectView(Wrapper<SushebaoxiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
