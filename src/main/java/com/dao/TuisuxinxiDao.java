package com.dao;

import com.entity.TuisuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuisuxinxiVO;
import com.entity.view.TuisuxinxiView;


/**
 * 退宿信息
 * 
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
public interface TuisuxinxiDao extends BaseMapper<TuisuxinxiEntity> {
	
	List<TuisuxinxiVO> selectListVO(@Param("ew") Wrapper<TuisuxinxiEntity> wrapper);
	
	TuisuxinxiVO selectVO(@Param("ew") Wrapper<TuisuxinxiEntity> wrapper);
	
	List<TuisuxinxiView> selectListView(@Param("ew") Wrapper<TuisuxinxiEntity> wrapper);

	List<TuisuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<TuisuxinxiEntity> wrapper);
	
	TuisuxinxiView selectView(@Param("ew") Wrapper<TuisuxinxiEntity> wrapper);
	
}
