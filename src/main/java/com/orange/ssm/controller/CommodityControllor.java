package com.orange.ssm.controller;
import com.orange.ssm.entity.Commodity;
import com.orange.ssm.service.CommodityService;
import com.orange.ssm.utils.Result;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhou
 */
@RestController
@RequestMapping(value = "/commodity")
public class CommodityControllor {
    @Resource
    private CommodityService commodityService;

    /**
     *
     * @param commodityId
     * @return Result
     * 查询商品信息
     */
    @GetMapping(value = "/commodityList/{commodityId}")
    public  Result Select(@PathVariable("commodityId") Integer commodityId) {

        System.out.println( commodityId );

        try {
            List<Commodity> commodityList = commodityService.selectAll( commodityId );
            return Result.success( commodityList );
        } catch (Exception e) {
            return Result.error();
        }
    }

    /**
     *
     * @param commodityId
     * @return Result
     * 删除购物车的商品
     */
    @GetMapping(value = "/delete/{commodityId}")
    public Result deleteBycommodityId(@PathVariable( "commodityId" ) int commodityId){

        try{
            int i = commodityService.deleteById(commodityId);
            return Result.success( i );
        }catch (Exception e){
            return Result.error();
        }
    }

    /**
     *
     * @param keyword
     * @return Result
     * 搜索功能
     */
    @GetMapping(value = "/search/{keyword}")
    public Result findByKeyword(@PathVariable( "keyword" ) String keyword){

        try{
            List<Commodity> list = commodityService.findByKeyword( keyword );
            return Result.success( list );
        }catch (Exception e){
            return Result.error();
        }
    }






}


/*

//post方法
    @PostMapping(value = "/commodityList")
    public  Result Select(Integer commodityId) {

        System.out.println( commodityId );

        try {
            List<Commodity> commodityList = commodityService.selectAll( commodityId );
            return Result.success( commodityList );
        } catch (Exception e) {
            return Result.error();
        }
    }


 */