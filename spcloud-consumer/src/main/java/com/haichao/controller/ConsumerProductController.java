package com.haichao.controller;

import com.haichao.vo.Product;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *     consumer api
 * </p>
 * @Author yusj
 * @Date 2019/3/15
 * @Version 1.0
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerProductController {
    public static final String PRODUCT_GET_URL = "http://localhost:8080/product/get/";
    public static final String PRODUCT_LIST_URL="http://localhost:8080/product/list/";
    public static final String PRODUCT_ADD_URL = "http://localhost:8080/product/add/";

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private HttpHeaders httpHeaders;

    @RequestMapping("/product/get")
    public Object getProduct(long id) {
        Product product = restTemplate.exchange(PRODUCT_GET_URL + id,
                HttpMethod.GET,new HttpEntity<Object>(httpHeaders), Product.class).getBody();
        return  product;
    }

    @RequestMapping("/product/list")
    public  Object listProduct() {
        List<Product> list = restTemplate.getForObject(PRODUCT_LIST_URL, List.class);
        return  list;
    }

    @RequestMapping("/product/add")
    public Object addPorduct(Product product) {
        Boolean result = restTemplate.postForObject(PRODUCT_ADD_URL, product, Boolean.class);
        return  result;
    }
}
