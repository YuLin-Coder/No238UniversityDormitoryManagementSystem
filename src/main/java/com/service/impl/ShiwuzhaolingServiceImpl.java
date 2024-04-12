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


import com.dao.ShiwuzhaolingDao;
import com.entity.ShiwuzhaolingEntity;
import com.service.ShiwuzhaolingService;
import com.entity.vo.ShiwuzhaolingVO;
import com.entity.view.ShiwuzhaolingView;

@Service("shiwuzhaolingService")
public class ShiwuzhaolingServiceImpl extends ServiceImpl<ShiwuzhaolingDao, ShiwuzhaolingEntity> implements ShiwuzhaolingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiwuzhaolingEntity> page = this.selectPage(
                new Query<ShiwuzhaolingEntity>(params).getPage(),
                new EntityWrapper<ShiwuzhaolingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiwuzhaolingEntity> wrapper) {
		  Page<ShiwuzhaolingView> page =new Query<ShiwuzhaolingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiwuzhaolingVO> selectListVO(Wrapper<ShiwuzhaolingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiwuzhaolingVO selectVO(Wrapper<ShiwuzhaolingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiwuzhaolingView> selectListView(Wrapper<ShiwuzhaolingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiwuzhaolingView selectView(Wrapper<ShiwuzhaolingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
