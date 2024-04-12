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


import com.dao.WupinxinxiDao;
import com.entity.WupinxinxiEntity;
import com.service.WupinxinxiService;
import com.entity.vo.WupinxinxiVO;
import com.entity.view.WupinxinxiView;

@Service("wupinxinxiService")
public class WupinxinxiServiceImpl extends ServiceImpl<WupinxinxiDao, WupinxinxiEntity> implements WupinxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WupinxinxiEntity> page = this.selectPage(
                new Query<WupinxinxiEntity>(params).getPage(),
                new EntityWrapper<WupinxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WupinxinxiEntity> wrapper) {
		  Page<WupinxinxiView> page =new Query<WupinxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WupinxinxiVO> selectListVO(Wrapper<WupinxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WupinxinxiVO selectVO(Wrapper<WupinxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WupinxinxiView> selectListView(Wrapper<WupinxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WupinxinxiView selectView(Wrapper<WupinxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
