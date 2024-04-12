package com.dao;

import com.entity.LoudongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LoudongVO;
import com.entity.view.LoudongView;


/**
 * 楼栋
 * 
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
public interface LoudongDao extends BaseMapper<LoudongEntity> {
	
	List<LoudongVO> selectListVO(@Param("ew") Wrapper<LoudongEntity> wrapper);
	
	LoudongVO selectVO(@Param("ew") Wrapper<LoudongEntity> wrapper);
	
	List<LoudongView> selectListView(@Param("ew") Wrapper<LoudongEntity> wrapper);

	List<LoudongView> selectListView(Pagination page,@Param("ew") Wrapper<LoudongEntity> wrapper);
	
	LoudongView selectView(@Param("ew") Wrapper<LoudongEntity> wrapper);
	
}
