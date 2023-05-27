package com.lc.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * 产品表
 * @TableName product_tb
 */

@Data
public class ProductTb implements Serializable {
    /**
     *  产品id
     */

    private Long productId;

    /**
     * 产品名称
     */
    private String productName;

    /**
     *  产品详情
     */
    private String productInfo;

    /**
     * 固定利率
     */
    private Double productInterestRate;

    /**
     * 买入手续费
     */
    private Double productBuy;

    /**
     * 卖出手续费
     */
    private Double productSell;

    /**
     *  产品负责人电话
     */
    private String productPhone;

    /**
     * 产品负责人名称
     */
    private String productUName;


    private static final long serialVersionUID = 1L;
}