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


import com.dao.WupinguihaiDao;
import com.entity.WupinguihaiEntity;
import com.service.WupinguihaiService;
import com.entity.vo.WupinguihaiVO;
import com.entity.view.WupinguihaiView;

@Service("wupinguihaiService")
public class WupinguihaiServiceImpl extends ServiceImpl<WupinguihaiDao, WupinguihaiEntity> implements WupinguihaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WupinguihaiEntity> page = this.selectPage(
                new Query<WupinguihaiEntity>(params).getPage(),
                new EntityWrapper<WupinguihaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WupinguihaiEntity> wrapper) {
		  Page<WupinguihaiView> page =new Query<WupinguihaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WupinguihaiVO> selectListVO(Wrapper<WupinguihaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WupinguihaiVO selectVO(Wrapper<WupinguihaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WupinguihaiView> selectListView(Wrapper<WupinguihaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WupinguihaiView selectView(Wrapper<WupinguihaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
