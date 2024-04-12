package com.dao;

import com.entity.SushebaoxiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SushebaoxiuVO;
import com.entity.view.SushebaoxiuView;


/**
 * 宿舍报修
 * 
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
public interface SushebaoxiuDao extends BaseMapper<SushebaoxiuEntity> {
	
	List<SushebaoxiuVO> selectListVO(@Param("ew") Wrapper<SushebaoxiuEntity> wrapper);
	
	SushebaoxiuVO selectVO(@Param("ew") Wrapper<SushebaoxiuEntity> wrapper);
	
	List<SushebaoxiuView> selectListView(@Param("ew") Wrapper<SushebaoxiuEntity> wrapper);

	List<SushebaoxiuView> selectListView(Pagination page,@Param("ew") Wrapper<SushebaoxiuEntity> wrapper);
	
	SushebaoxiuView selectView(@Param("ew") Wrapper<SushebaoxiuEntity> wrapper);
	
}
