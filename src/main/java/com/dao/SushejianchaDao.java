package com.dao;

import com.entity.SushejianchaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SushejianchaVO;
import com.entity.view.SushejianchaView;


/**
 * 宿舍检查
 * 
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
public interface SushejianchaDao extends BaseMapper<SushejianchaEntity> {
	
	List<SushejianchaVO> selectListVO(@Param("ew") Wrapper<SushejianchaEntity> wrapper);
	
	SushejianchaVO selectVO(@Param("ew") Wrapper<SushejianchaEntity> wrapper);
	
	List<SushejianchaView> selectListView(@Param("ew") Wrapper<SushejianchaEntity> wrapper);

	List<SushejianchaView> selectListView(Pagination page,@Param("ew") Wrapper<SushejianchaEntity> wrapper);
	
	SushejianchaView selectView(@Param("ew") Wrapper<SushejianchaEntity> wrapper);
	
}
