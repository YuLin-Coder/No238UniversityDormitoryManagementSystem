package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SuguanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SuguanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SuguanView;


/**
 * 宿管
 *
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
public interface SuguanService extends IService<SuguanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SuguanVO> selectListVO(Wrapper<SuguanEntity> wrapper);
   	
   	SuguanVO selectVO(@Param("ew") Wrapper<SuguanEntity> wrapper);
   	
   	List<SuguanView> selectListView(Wrapper<SuguanEntity> wrapper);
   	
   	SuguanView selectView(@Param("ew") Wrapper<SuguanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SuguanEntity> wrapper);
   	
}

