package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SushebaoxiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SushebaoxiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SushebaoxiuView;


/**
 * 宿舍报修
 *
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
public interface SushebaoxiuService extends IService<SushebaoxiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SushebaoxiuVO> selectListVO(Wrapper<SushebaoxiuEntity> wrapper);
   	
   	SushebaoxiuVO selectVO(@Param("ew") Wrapper<SushebaoxiuEntity> wrapper);
   	
   	List<SushebaoxiuView> selectListView(Wrapper<SushebaoxiuEntity> wrapper);
   	
   	SushebaoxiuView selectView(@Param("ew") Wrapper<SushebaoxiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SushebaoxiuEntity> wrapper);
   	
}

