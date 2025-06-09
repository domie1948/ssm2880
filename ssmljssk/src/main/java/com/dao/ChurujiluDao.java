package com.dao;

import com.entity.ChurujiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChurujiluVO;
import com.entity.view.ChurujiluView;


/**
 * 出入记录
 * 
 * @author 
 * @email 
 * @date 2021-04-11 18:17:26
 */
public interface ChurujiluDao extends BaseMapper<ChurujiluEntity> {
	
	List<ChurujiluVO> selectListVO(@Param("ew") Wrapper<ChurujiluEntity> wrapper);
	
	ChurujiluVO selectVO(@Param("ew") Wrapper<ChurujiluEntity> wrapper);
	
	List<ChurujiluView> selectListView(@Param("ew") Wrapper<ChurujiluEntity> wrapper);

	List<ChurujiluView> selectListView(Pagination page,@Param("ew") Wrapper<ChurujiluEntity> wrapper);
	
	ChurujiluView selectView(@Param("ew") Wrapper<ChurujiluEntity> wrapper);
	
}
