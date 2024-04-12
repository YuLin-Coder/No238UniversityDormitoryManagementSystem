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


import com.dao.WupinjieyongDao;
import com.entity.WupinjieyongEntity;
import com.service.WupinjieyongService;
import com.entity.vo.WupinjieyongVO;
import com.entity.view.WupinjieyongView;

@Service("wupinjieyongService")
public class WupinjieyongServiceImpl extends ServiceImpl<WupinjieyongDao, WupinjieyongEntity> implements WupinjieyongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WupinjieyongEntity> page = this.selectPage(
                new Query<WupinjieyongEntity>(params).getPage(),
                new EntityWrapper<WupinjieyongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WupinjieyongEntity> wrapper) {
		  Page<WupinjieyongView> page =new Query<WupinjieyongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WupinjieyongVO> selectListVO(Wrapper<WupinjieyongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WupinjieyongVO selectVO(Wrapper<WupinjieyongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WupinjieyongView> selectListView(Wrapper<WupinjieyongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WupinjieyongView selectView(Wrapper<WupinjieyongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
