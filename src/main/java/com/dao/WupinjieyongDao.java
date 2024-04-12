package com.dao;

import com.entity.WupinjieyongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WupinjieyongVO;
import com.entity.view.WupinjieyongView;


/**
 * 物品借用
 * 
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
public interface WupinjieyongDao extends BaseMapper<WupinjieyongEntity> {
	
	List<WupinjieyongVO> selectListVO(@Param("ew") Wrapper<WupinjieyongEntity> wrapper);
	
	WupinjieyongVO selectVO(@Param("ew") Wrapper<WupinjieyongEntity> wrapper);
	
	List<WupinjieyongView> selectListView(@Param("ew") Wrapper<WupinjieyongEntity> wrapper);

	List<WupinjieyongView> selectListView(Pagination page,@Param("ew") Wrapper<WupinjieyongEntity> wrapper);
	
	WupinjieyongView selectView(@Param("ew") Wrapper<WupinjieyongEntity> wrapper);
	
}
