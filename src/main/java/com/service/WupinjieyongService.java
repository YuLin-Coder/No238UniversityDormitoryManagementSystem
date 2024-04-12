package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WupinjieyongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WupinjieyongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WupinjieyongView;


/**
 * 物品借用
 *
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
public interface WupinjieyongService extends IService<WupinjieyongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WupinjieyongVO> selectListVO(Wrapper<WupinjieyongEntity> wrapper);
   	
   	WupinjieyongVO selectVO(@Param("ew") Wrapper<WupinjieyongEntity> wrapper);
   	
   	List<WupinjieyongView> selectListView(Wrapper<WupinjieyongEntity> wrapper);
   	
   	WupinjieyongView selectView(@Param("ew") Wrapper<WupinjieyongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WupinjieyongEntity> wrapper);
   	
}

