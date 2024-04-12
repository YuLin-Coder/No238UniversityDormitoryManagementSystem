package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaqiliuxiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaqiliuxiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaqiliuxiaoView;


/**
 * 假期留校
 *
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
public interface JiaqiliuxiaoService extends IService<JiaqiliuxiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaqiliuxiaoVO> selectListVO(Wrapper<JiaqiliuxiaoEntity> wrapper);
   	
   	JiaqiliuxiaoVO selectVO(@Param("ew") Wrapper<JiaqiliuxiaoEntity> wrapper);
   	
   	List<JiaqiliuxiaoView> selectListView(Wrapper<JiaqiliuxiaoEntity> wrapper);
   	
   	JiaqiliuxiaoView selectView(@Param("ew") Wrapper<JiaqiliuxiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaqiliuxiaoEntity> wrapper);
   	
}

