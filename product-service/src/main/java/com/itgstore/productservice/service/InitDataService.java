package com.itgstore.productservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.itgstore.productservice.repository.ProductRepository;
import java.lang.String;
import com.itgstore.productservice.domain.Product;

import java.util.stream.Stream;

//@Component
class InitDataService implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... strings) throws Exception {
        Stream.of("Pencil", "Book", "Eraser").forEach(s->productRepository.save(new Product(s)));
        productRepository.findAll().forEach(s->System.out.println(s.getName()));
    } 

}