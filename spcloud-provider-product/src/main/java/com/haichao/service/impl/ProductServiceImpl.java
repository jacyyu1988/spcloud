package com.haichao.service.impl;

import com.haichao.mapper.ProductMapper;
import com.haichao.service.IProductService;
import com.haichao.vo.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *
 * @Desc </p>
 * @Author yusj
 * @Date 2019/3/15
 * @Version 1.0
 */
@Service
public class ProductServiceImpl implements IProductService {

    @Resource
    private ProductMapper productMapper;

    @Override
    public Product get(long id) {
        return productMapper.findById(id);
    }

    @Override
    public boolean add(Product product) {
        return productMapper.create(product);
    }

    @Override
    public List<Product> list() {
        return productMapper.findAll();
    }
}
