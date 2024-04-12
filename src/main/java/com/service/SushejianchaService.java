package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SushejianchaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SushejianchaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SushejianchaView;


/**
 * 宿舍检查
 *
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
public interface SushejianchaService extends IService<SushejianchaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SushejianchaVO> selectListVO(Wrapper<SushejianchaEntity> wrapper);
   	
   	SushejianchaVO selectVO(@Param("ew") Wrapper<SushejianchaEntity> wrapper);
   	
   	List<SushejianchaView> selectListView(Wrapper<SushejianchaEntity> wrapper);
   	
   	SushejianchaView selectView(@Param("ew") Wrapper<SushejianchaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SushejianchaEntity> wrapper);
   	
}

