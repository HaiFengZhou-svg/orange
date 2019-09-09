package com.orange.ssm.service;

import com.orange.ssm.entity.Collector;

import java.util.List;

public interface CollectorService{

    /**
     * @param colletorId
     * @return Integer
     * 删除购物车的商品
     */
    int deleteByPrimaryKey(Integer colletorId);


    int insertSelective(Collector record);

}
