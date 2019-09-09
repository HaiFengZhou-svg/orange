package com.orange.ssm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.orange.ssm.mapper.CollectorMapper;
import com.orange.ssm.entity.Collector;
import com.orange.ssm.service.CollectorService;

import java.util.List;

@Service
public class CollectorServiceImpl implements CollectorService{

    @Resource
    private CollectorMapper collectorMapper;

    @Override
    public int deleteByPrimaryKey(Integer colletorId) {
        return collectorMapper.deleteByPrimaryKey(colletorId);
    }

    @Override
    public int insertSelective(Collector record) {
        return collectorMapper.insertSelective(record);
    }


}



