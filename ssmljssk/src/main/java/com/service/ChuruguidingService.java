package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChuruguidingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChuruguidingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChuruguidingView;


/**
 * 出入规定
 *
 * @author 
 * @email 
 * @date 2021-04-11 18:17:26
 */
public interface ChuruguidingService extends IService<ChuruguidingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChuruguidingVO> selectListVO(Wrapper<ChuruguidingEntity> wrapper);
   	
   	ChuruguidingVO selectVO(@Param("ew") Wrapper<ChuruguidingEntity> wrapper);
   	
   	List<ChuruguidingView> selectListView(Wrapper<ChuruguidingEntity> wrapper);
   	
   	ChuruguidingView selectView(@Param("ew") Wrapper<ChuruguidingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChuruguidingEntity> wrapper);
   	
}

