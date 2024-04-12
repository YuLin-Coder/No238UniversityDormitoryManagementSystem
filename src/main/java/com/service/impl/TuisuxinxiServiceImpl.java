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


import com.dao.TuisuxinxiDao;
import com.entity.TuisuxinxiEntity;
import com.service.TuisuxinxiService;
import com.entity.vo.TuisuxinxiVO;
import com.entity.view.TuisuxinxiView;

@Service("tuisuxinxiService")
public class TuisuxinxiServiceImpl extends ServiceImpl<TuisuxinxiDao, TuisuxinxiEntity> implements TuisuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuisuxinxiEntity> page = this.selectPage(
                new Query<TuisuxinxiEntity>(params).getPage(),
                new EntityWrapper<TuisuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuisuxinxiEntity> wrapper) {
		  Page<TuisuxinxiView> page =new Query<TuisuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TuisuxinxiVO> selectListVO(Wrapper<TuisuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuisuxinxiVO selectVO(Wrapper<TuisuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuisuxinxiView> selectListView(Wrapper<TuisuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuisuxinxiView selectView(Wrapper<TuisuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
