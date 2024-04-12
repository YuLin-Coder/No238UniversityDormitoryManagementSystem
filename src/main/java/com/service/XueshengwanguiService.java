package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengwanguiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengwanguiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengwanguiView;


/**
 * 学生晚归
 *
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
public interface XueshengwanguiService extends IService<XueshengwanguiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengwanguiVO> selectListVO(Wrapper<XueshengwanguiEntity> wrapper);
   	
   	XueshengwanguiVO selectVO(@Param("ew") Wrapper<XueshengwanguiEntity> wrapper);
   	
   	List<XueshengwanguiView> selectListView(Wrapper<XueshengwanguiEntity> wrapper);
   	
   	XueshengwanguiView selectView(@Param("ew") Wrapper<XueshengwanguiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengwanguiEntity> wrapper);
   	
}

