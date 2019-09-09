package com.orange.ssm.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class Collector implements Serializable {
    /**
     * colletorId
     */
    private Integer colletorId;

    /**
     * commodoityName
     */
    private String commodoityName;

    /**
     * price
     */
    private Double price;

    /**
     * describe
     */
    private String describe;

    /**
     * flag
     */
    private Integer flag;

    private static final long serialVersionUID = 1L;
}