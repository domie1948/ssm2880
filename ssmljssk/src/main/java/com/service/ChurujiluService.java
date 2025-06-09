package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChurujiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChurujiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChurujiluView;


/**
 * 出入记录
 *
 * @author 
 * @email 
 * @date 2021-04-11 18:17:26
 */
public interface ChurujiluService extends IService<ChurujiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChurujiluVO> selectListVO(Wrapper<ChurujiluEntity> wrapper);
   	
   	ChurujiluVO selectVO(@Param("ew") Wrapper<ChurujiluEntity> wrapper);
   	
   	List<ChurujiluView> selectListView(Wrapper<ChurujiluEntity> wrapper);
   	
   	ChurujiluView selectView(@Param("ew") Wrapper<ChurujiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChurujiluEntity> wrapper);
   	
}

