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


import com.dao.JiaqiliuxiaoDao;
import com.entity.JiaqiliuxiaoEntity;
import com.service.JiaqiliuxiaoService;
import com.entity.vo.JiaqiliuxiaoVO;
import com.entity.view.JiaqiliuxiaoView;

@Service("jiaqiliuxiaoService")
public class JiaqiliuxiaoServiceImpl extends ServiceImpl<JiaqiliuxiaoDao, JiaqiliuxiaoEntity> implements JiaqiliuxiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaqiliuxiaoEntity> page = this.selectPage(
                new Query<JiaqiliuxiaoEntity>(params).getPage(),
                new EntityWrapper<JiaqiliuxiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaqiliuxiaoEntity> wrapper) {
		  Page<JiaqiliuxiaoView> page =new Query<JiaqiliuxiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaqiliuxiaoVO> selectListVO(Wrapper<JiaqiliuxiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaqiliuxiaoVO selectVO(Wrapper<JiaqiliuxiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaqiliuxiaoView> selectListView(Wrapper<JiaqiliuxiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaqiliuxiaoView selectView(Wrapper<JiaqiliuxiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
