package com.orange.ssm.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class Shop implements Serializable {
    /**
     * 主键商品ID
     */
    private Integer shopId;

    /**
     * 商品的名称
     */
    private String productName;

    /**
     * 商品的标题
     */
    private String title;

    /**
     * 商品价格
     */
    private BigDecimal originalPrice;

    /**
     * 促销价
     */
    private BigDecimal promotePrice;

    /**
     * 商品存量
     */
    private Integer stock;

    /**
     * 商品的分类信息
     */
    private Integer categoryId;

    /**
     * 商品的状态
     */
    private Byte status;

}

