package com.dao;

import com.entity.XueshengwanguiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengwanguiVO;
import com.entity.view.XueshengwanguiView;


/**
 * 学生晚归
 * 
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
public interface XueshengwanguiDao extends BaseMapper<XueshengwanguiEntity> {
	
	List<XueshengwanguiVO> selectListVO(@Param("ew") Wrapper<XueshengwanguiEntity> wrapper);
	
	XueshengwanguiVO selectVO(@Param("ew") Wrapper<XueshengwanguiEntity> wrapper);
	
	List<XueshengwanguiView> selectListView(@Param("ew") Wrapper<XueshengwanguiEntity> wrapper);

	List<XueshengwanguiView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengwanguiEntity> wrapper);
	
	XueshengwanguiView selectView(@Param("ew") Wrapper<XueshengwanguiEntity> wrapper);
	
}
