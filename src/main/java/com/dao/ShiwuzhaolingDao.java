package com.dao;

import com.entity.ShiwuzhaolingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiwuzhaolingVO;
import com.entity.view.ShiwuzhaolingView;


/**
 * 失物招领
 * 
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
public interface ShiwuzhaolingDao extends BaseMapper<ShiwuzhaolingEntity> {
	
	List<ShiwuzhaolingVO> selectListVO(@Param("ew") Wrapper<ShiwuzhaolingEntity> wrapper);
	
	ShiwuzhaolingVO selectVO(@Param("ew") Wrapper<ShiwuzhaolingEntity> wrapper);
	
	List<ShiwuzhaolingView> selectListView(@Param("ew") Wrapper<ShiwuzhaolingEntity> wrapper);

	List<ShiwuzhaolingView> selectListView(Pagination page,@Param("ew") Wrapper<ShiwuzhaolingEntity> wrapper);
	
	ShiwuzhaolingView selectView(@Param("ew") Wrapper<ShiwuzhaolingEntity> wrapper);
	
}
