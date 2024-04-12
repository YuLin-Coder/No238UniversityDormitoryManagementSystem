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


import com.dao.LoudongDao;
import com.entity.LoudongEntity;
import com.service.LoudongService;
import com.entity.vo.LoudongVO;
import com.entity.view.LoudongView;

@Service("loudongService")
public class LoudongServiceImpl extends ServiceImpl<LoudongDao, LoudongEntity> implements LoudongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LoudongEntity> page = this.selectPage(
                new Query<LoudongEntity>(params).getPage(),
                new EntityWrapper<LoudongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LoudongEntity> wrapper) {
		  Page<LoudongView> page =new Query<LoudongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LoudongVO> selectListVO(Wrapper<LoudongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LoudongVO selectVO(Wrapper<LoudongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LoudongView> selectListView(Wrapper<LoudongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LoudongView selectView(Wrapper<LoudongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
