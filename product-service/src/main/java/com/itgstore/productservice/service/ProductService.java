package com.itgstore.productservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itgstore.productservice.repository.ProductRepository;
import java.util.List;

import com.itgstore.productservice.domain.Product;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    /**
     * Enregistrer/ Modifier un produit
     * @param product
     * @return product
     */
    public Product save(Product product){
        return productRepository.save(product);
    }

    /**
     * Récupérer un produit en fonction de son ID
     * @param id
     * @return product
     */
    public Product getProduct(Long id){
        return productRepository.findById(id).get();
    }

    /**
     * Récupérer la liste des produits
     * @return product list
     */
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    /**
     * Suppression d'un produit en fonction de l'id
     * @param id
     */
    public void delete(Long id){
        productRepository.deleteById(id);
    }


}