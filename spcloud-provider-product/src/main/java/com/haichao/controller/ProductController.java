package com.haichao.controller;

import com.haichao.service.IProductService;
import com.haichao.vo.Product;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *
 * </p>
 * @Author yusj
 * @Date 2019/3/15
 * @Version 1.0
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Resource
    private IProductService iProductService;

    @Resource
    private DiscoveryClient client ;

    @RequestMapping(value="/get/{id}")
    public Object get(@PathVariable("id") long id) {
        return this.iProductService.get(id) ;
    }

    @RequestMapping(value="/add")
    public Object add(@RequestBody Product product) {
        return this.iProductService.add(product) ;
    }

    @RequestMapping(value="/list")
    public Object list() {
        return this.iProductService.list() ;
    }

    // 直接返回发现服务信息
    @RequestMapping("/discover")
    public Object discover() {
        return this.client ;
    }
}
