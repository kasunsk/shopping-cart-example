package com.mycom.shoppingcart.service.impl;

import com.mycom.shoppingcart.dao.ProductDao;
import com.mycom.shoppingcart.model.Product;
import com.mycom.shoppingcart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Boolean saveProduct(Product product) {
        productDao.save(product);
        return Boolean.TRUE;
    }
}
