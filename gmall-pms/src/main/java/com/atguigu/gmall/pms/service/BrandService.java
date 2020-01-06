package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.BrandEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import org.apache.ibatis.annotations.Param;


/**
 * 品牌
 *
 * @author layfones
 * @email layfones@gmail.com
 * @date 2020-01-05 11:18:31
 */
public interface BrandService extends IService<BrandEntity> {

    PageVo queryPage(QueryCondition params);
}

