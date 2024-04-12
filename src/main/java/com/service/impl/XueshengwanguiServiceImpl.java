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


import com.dao.XueshengwanguiDao;
import com.entity.XueshengwanguiEntity;
import com.service.XueshengwanguiService;
import com.entity.vo.XueshengwanguiVO;
import com.entity.view.XueshengwanguiView;

@Service("xueshengwanguiService")
public class XueshengwanguiServiceImpl extends ServiceImpl<XueshengwanguiDao, XueshengwanguiEntity> implements XueshengwanguiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengwanguiEntity> page = this.selectPage(
                new Query<XueshengwanguiEntity>(params).getPage(),
                new EntityWrapper<XueshengwanguiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengwanguiEntity> wrapper) {
		  Page<XueshengwanguiView> page =new Query<XueshengwanguiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengwanguiVO> selectListVO(Wrapper<XueshengwanguiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengwanguiVO selectVO(Wrapper<XueshengwanguiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengwanguiView> selectListView(Wrapper<XueshengwanguiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengwanguiView selectView(Wrapper<XueshengwanguiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
