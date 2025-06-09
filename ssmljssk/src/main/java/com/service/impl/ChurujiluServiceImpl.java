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


import com.dao.ChurujiluDao;
import com.entity.ChurujiluEntity;
import com.service.ChurujiluService;
import com.entity.vo.ChurujiluVO;
import com.entity.view.ChurujiluView;

@Service("churujiluService")
public class ChurujiluServiceImpl extends ServiceImpl<ChurujiluDao, ChurujiluEntity> implements ChurujiluService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChurujiluEntity> page = this.selectPage(
                new Query<ChurujiluEntity>(params).getPage(),
                new EntityWrapper<ChurujiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChurujiluEntity> wrapper) {
		  Page<ChurujiluView> page =new Query<ChurujiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChurujiluVO> selectListVO(Wrapper<ChurujiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChurujiluVO selectVO(Wrapper<ChurujiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChurujiluView> selectListView(Wrapper<ChurujiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChurujiluView selectView(Wrapper<ChurujiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
