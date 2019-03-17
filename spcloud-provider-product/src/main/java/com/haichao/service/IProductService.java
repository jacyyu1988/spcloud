package com.haichao.service;

import com.haichao.vo.Product;

import java.util.List;

/**
 * <p>
 *
 * </p>
 * @Author yusj
 * @Date 2019/3/15
 * @Version 1.0
 */
public interface IProductService {
    Product get(long id);
    boolean add(Product product);
    List<Product> list();
}