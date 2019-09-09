package com.orange.ssm.mapper;

import com.orange.ssm.entity.Collector;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CollectorMapper {

    /**
     * @param colletorId
     * @return Integer
     * 删除购物车的商品
     */
    int deleteByPrimaryKey(Integer colletorId);

    int insertSelective(Collector record);




}