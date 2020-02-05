package com.mycom.shoppingcart.receiver;

import com.mycom.shoppingcart.model.Product;
import com.mycom.shoppingcart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @Autowired
    private ProductService productService;

    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        Product product = convertToProduct(message);
        persistProduct(product);
    }

    private Product convertToProduct(String message) {
        return null;
    }

    private void persistProduct(Product product) {
        productService.saveProduct(product);
    }
}
