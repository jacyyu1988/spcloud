package com.haichao.mapper;

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
public interface ProductMapper {
    boolean create(Product product);
    public Product findById(Long id);
    public List<Product> findAll();
}
