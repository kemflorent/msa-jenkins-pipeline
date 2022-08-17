package com.itgstore.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.itgstore.productservice.domain.Product;
import java.lang.Long;

public interface ProductRepository extends JpaRepository<Product, Long> {

}