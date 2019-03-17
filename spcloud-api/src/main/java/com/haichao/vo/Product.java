package com.haichao.vo;

import java.io.Serializable;

/**
 * <p>
 *    product 实体类  供服务提供与调用方使用
 * </p>
 * @Author yusj
 * @Date 2019/3/15
 * @Version 1.0
 */
public class Product implements Serializable {
    private Long productId;
    private String productName;
    private String productDesc;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productDesc='" + productDesc + '\'' +
                '}';
    }
}
