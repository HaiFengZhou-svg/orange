package com.orange.ssm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.orange.ssm.mapper.CommodityMapper;
import com.orange.ssm.entity.Commodity;
import com.orange.ssm.service.CommodityService;

import java.util.List;

@Service
public class CommodityServiceImpl implements CommodityService {

    @Resource
    private CommodityMapper commodityMapper;

    @Override
    public int insert(Commodity record) {
        return commodityMapper.insert( record );
    }

    @Override
    public int insertSelective(Commodity record) {
        return commodityMapper.insertSelective( record );
    }



    @Override
    public List<Commodity> selectAll(Integer commodityId) {
        System.out.println(commodityId);

        return commodityMapper.selectAll( commodityId );
    }

    @Override
    public int deleteById(int commodityId) {

        return commodityMapper.deleteById( commodityId );
    }

    @Override
    public List<Commodity> findByKeyword(String keyword) {

        return commodityMapper.findByKeyword( keyword );
    }

}



