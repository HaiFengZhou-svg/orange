package com.orange.ssm.controller;
import com.orange.ssm.service.CollectorService;
import com.orange.ssm.utils.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RequestMapping("/collector")
@RestController
public class CollertorControllor {

    @Resource
    private CollectorService collectorService;


    /**
     *
     * @param colletor_id
     * @return Result
     * 删除购物车的商品
     *
     */
    @GetMapping("/delete/{colletor_id}")
    public Result deleteByPrimaryKey(@PathVariable("colletor_id") Integer colletor_id){

        try{
            Integer integer = collectorService.deleteByPrimaryKey(colletor_id);
            return Result.success( integer );
        }catch (Exception e){
            return  Result.error();
        }
    }




}
