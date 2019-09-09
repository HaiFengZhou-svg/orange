package com.orange.ssm.service;

import com.orange.ssm.entity.Commodity;
import com.sun.org.glassfish.external.probe.provider.annotations.ProbeParam;


import java.util.List;

public interface CommodityService {


    int insert(Commodity record);


    int insertSelective(Commodity record);

    /**
     * @param commodityId
     * @return List
     */
    List<Commodity> selectAll(Integer commodityId);

    /**
     * @param commodityId
     * @return int
     */
    int deleteById(int commodityId);


    /**
     *
     * @param keyword
     * @return List<Commodity>
     */
    List<Commodity>findByKeyword(@ProbeParam( "keyword" ) String keyword);




}



