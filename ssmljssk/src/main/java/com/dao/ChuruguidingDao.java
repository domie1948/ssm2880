package com.dao;

import com.entity.ChuruguidingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChuruguidingVO;
import com.entity.view.ChuruguidingView;


/**
 * 出入规定
 * 
 * @author 
 * @email 
 * @date 2021-04-11 18:17:26
 */
public interface ChuruguidingDao extends BaseMapper<ChuruguidingEntity> {
	
	List<ChuruguidingVO> selectListVO(@Param("ew") Wrapper<ChuruguidingEntity> wrapper);
	
	ChuruguidingVO selectVO(@Param("ew") Wrapper<ChuruguidingEntity> wrapper);
	
	List<ChuruguidingView> selectListView(@Param("ew") Wrapper<ChuruguidingEntity> wrapper);

	List<ChuruguidingView> selectListView(Pagination page,@Param("ew") Wrapper<ChuruguidingEntity> wrapper);
	
	ChuruguidingView selectView(@Param("ew") Wrapper<ChuruguidingEntity> wrapper);
	
}
