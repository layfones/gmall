package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author layfones
 * @email layfones@gmail.com
 * @date 2020-01-05 11:18:31
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
