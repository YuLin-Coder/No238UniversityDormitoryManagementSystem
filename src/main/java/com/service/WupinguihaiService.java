package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WupinguihaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WupinguihaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WupinguihaiView;


/**
 * 物品归还
 *
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
public interface WupinguihaiService extends IService<WupinguihaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WupinguihaiVO> selectListVO(Wrapper<WupinguihaiEntity> wrapper);
   	
   	WupinguihaiVO selectVO(@Param("ew") Wrapper<WupinguihaiEntity> wrapper);
   	
   	List<WupinguihaiView> selectListView(Wrapper<WupinguihaiEntity> wrapper);
   	
   	WupinguihaiView selectView(@Param("ew") Wrapper<WupinguihaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WupinguihaiEntity> wrapper);
   	
}

