package com.entity.view;

import com.entity.DiscussremaishangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 热卖商品评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-06 14:33:24
 */
@TableName("discussremaishangpin")
public class DiscussremaishangpinView  extends DiscussremaishangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussremaishangpinView(){
	}
 
 	public DiscussremaishangpinView(DiscussremaishangpinEntity discussremaishangpinEntity){
 	try {
			BeanUtils.copyProperties(this, discussremaishangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}