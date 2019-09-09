package com.orange.ssm.mapper;

import com.orange.ssm.entity.Commodity;
import com.sun.org.glassfish.external.probe.provider.annotations.ProbeParam;
import org.apache.ibatis.annotations.Mapper;import java.util.List;

@Mapper
public interface CommodityMapper {
    int insert(Commodity record);

    int insertSelective(Commodity record);

    /**
     *
     * @param commodityId
     * @return List<Commodity>
     */
    List<Commodity> selectAll(Integer commodityId);

    /**
     *
     * @param commodity
     * @return int
     */
    int deleteById(int commodity);

    /**
     *
     * @param keyword
     * @return List<Commodity>
     */
    List<Commodity>findByKeyword(@ProbeParam( "keyword" ) String keyword);


}