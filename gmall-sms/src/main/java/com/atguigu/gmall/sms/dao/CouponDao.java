package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author layfones
 * @email layfones@gmail.com
 * @date 2020-01-06 14:21:20
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
