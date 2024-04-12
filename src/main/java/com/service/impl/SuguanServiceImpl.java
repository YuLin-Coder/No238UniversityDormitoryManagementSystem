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


import com.dao.SuguanDao;
import com.entity.SuguanEntity;
import com.service.SuguanService;
import com.entity.vo.SuguanVO;
import com.entity.view.SuguanView;

@Service("suguanService")
public class SuguanServiceImpl extends ServiceImpl<SuguanDao, SuguanEntity> implements SuguanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SuguanEntity> page = this.selectPage(
                new Query<SuguanEntity>(params).getPage(),
                new EntityWrapper<SuguanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SuguanEntity> wrapper) {
		  Page<SuguanView> page =new Query<SuguanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SuguanVO> selectListVO(Wrapper<SuguanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SuguanVO selectVO(Wrapper<SuguanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SuguanView> selectListView(Wrapper<SuguanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SuguanView selectView(Wrapper<SuguanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
