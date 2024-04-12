package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiwuzhaolingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiwuzhaolingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiwuzhaolingView;


/**
 * 失物招领
 *
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
public interface ShiwuzhaolingService extends IService<ShiwuzhaolingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiwuzhaolingVO> selectListVO(Wrapper<ShiwuzhaolingEntity> wrapper);
   	
   	ShiwuzhaolingVO selectVO(@Param("ew") Wrapper<ShiwuzhaolingEntity> wrapper);
   	
   	List<ShiwuzhaolingView> selectListView(Wrapper<ShiwuzhaolingEntity> wrapper);
   	
   	ShiwuzhaolingView selectView(@Param("ew") Wrapper<ShiwuzhaolingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiwuzhaolingEntity> wrapper);
   	
}

