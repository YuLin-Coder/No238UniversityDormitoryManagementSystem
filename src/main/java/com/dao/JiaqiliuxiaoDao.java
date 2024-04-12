package com.dao;

import com.entity.JiaqiliuxiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaqiliuxiaoVO;
import com.entity.view.JiaqiliuxiaoView;


/**
 * 假期留校
 * 
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
public interface JiaqiliuxiaoDao extends BaseMapper<JiaqiliuxiaoEntity> {
	
	List<JiaqiliuxiaoVO> selectListVO(@Param("ew") Wrapper<JiaqiliuxiaoEntity> wrapper);
	
	JiaqiliuxiaoVO selectVO(@Param("ew") Wrapper<JiaqiliuxiaoEntity> wrapper);
	
	List<JiaqiliuxiaoView> selectListView(@Param("ew") Wrapper<JiaqiliuxiaoEntity> wrapper);

	List<JiaqiliuxiaoView> selectListView(Pagination page,@Param("ew") Wrapper<JiaqiliuxiaoEntity> wrapper);
	
	JiaqiliuxiaoView selectView(@Param("ew") Wrapper<JiaqiliuxiaoEntity> wrapper);
	
}
