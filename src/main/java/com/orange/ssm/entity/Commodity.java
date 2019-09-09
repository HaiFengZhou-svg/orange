package com.orange.ssm.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class Commodity implements Serializable {
    private Integer commodityid;

    private String commodityname;

    private Double price;

    private Integer number;

    private String describe;

    private Integer flag;

    private static final long serialVersionUID = 1L;
}