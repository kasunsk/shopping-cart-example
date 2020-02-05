package com.mycom.shoppingcart.dao;

import com.mycom.shoppingcart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("productDao")
public interface ProductDao extends JpaRepository<Product, Long> {
}
