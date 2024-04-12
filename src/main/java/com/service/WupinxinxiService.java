package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WupinxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WupinxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WupinxinxiView;


/**
 * 物品信息
 *
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
public interface WupinxinxiService extends IService<WupinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WupinxinxiVO> selectListVO(Wrapper<WupinxinxiEntity> wrapper);
   	
   	WupinxinxiVO selectVO(@Param("ew") Wrapper<WupinxinxiEntity> wrapper);
   	
   	List<WupinxinxiView> selectListView(Wrapper<WupinxinxiEntity> wrapper);
   	
   	WupinxinxiView selectView(@Param("ew") Wrapper<WupinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WupinxinxiEntity> wrapper);
   	
}

