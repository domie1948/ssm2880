package com.entity.view;

import com.entity.ChurujiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 出入记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-11 18:17:26
 */
@TableName("churujilu")
public class ChurujiluView  extends ChurujiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChurujiluView(){
	}
 
 	public ChurujiluView(ChurujiluEntity churujiluEntity){
 	try {
			BeanUtils.copyProperties(this, churujiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
