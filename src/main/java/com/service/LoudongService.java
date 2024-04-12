package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LoudongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LoudongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LoudongView;


/**
 * 楼栋
 *
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
public interface LoudongService extends IService<LoudongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LoudongVO> selectListVO(Wrapper<LoudongEntity> wrapper);
   	
   	LoudongVO selectVO(@Param("ew") Wrapper<LoudongEntity> wrapper);
   	
   	List<LoudongView> selectListView(Wrapper<LoudongEntity> wrapper);
   	
   	LoudongView selectView(@Param("ew") Wrapper<LoudongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LoudongEntity> wrapper);
   	
}

