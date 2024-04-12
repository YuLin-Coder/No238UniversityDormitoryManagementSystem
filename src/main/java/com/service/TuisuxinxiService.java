package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuisuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TuisuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TuisuxinxiView;


/**
 * 退宿信息
 *
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
public interface TuisuxinxiService extends IService<TuisuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuisuxinxiVO> selectListVO(Wrapper<TuisuxinxiEntity> wrapper);
   	
   	TuisuxinxiVO selectVO(@Param("ew") Wrapper<TuisuxinxiEntity> wrapper);
   	
   	List<TuisuxinxiView> selectListView(Wrapper<TuisuxinxiEntity> wrapper);
   	
   	TuisuxinxiView selectView(@Param("ew") Wrapper<TuisuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuisuxinxiEntity> wrapper);
   	
}

