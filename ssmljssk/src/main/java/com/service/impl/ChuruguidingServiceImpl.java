package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChuruguidingDao;
import com.entity.ChuruguidingEntity;
import com.service.ChuruguidingService;
import com.entity.vo.ChuruguidingVO;
import com.entity.view.ChuruguidingView;

@Service("churuguidingService")
public class ChuruguidingServiceImpl extends ServiceImpl<ChuruguidingDao, ChuruguidingEntity> implements ChuruguidingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChuruguidingEntity> page = this.selectPage(
                new Query<ChuruguidingEntity>(params).getPage(),
                new EntityWrapper<ChuruguidingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChuruguidingEntity> wrapper) {
		  Page<ChuruguidingView> page =new Query<ChuruguidingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChuruguidingVO> selectListVO(Wrapper<ChuruguidingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChuruguidingVO selectVO(Wrapper<ChuruguidingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChuruguidingView> selectListView(Wrapper<ChuruguidingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChuruguidingView selectView(Wrapper<ChuruguidingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
