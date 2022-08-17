package com.itgstore.productservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.itgstore.productservice.domain.Product;
import com.itgstore.productservice.service.ProductService;

@RestController
@RequestMapping("api/product")
public class ProductController {

   Logger log = LoggerFactory.getLogger(ProductController.class);

   @Autowired
   ProductService productService;

   @Value("${me}")
   private String me;

   @RequestMapping("/messages")
   public String tellMe(){
      System.out.println("c'est moi qui ai répondu!");
      return me;
   }

   /**
    * Creation d'un produit
    * @param product
    * @return product
    */
   @PostMapping("/create")
   public Product create(@RequestBody Product product){
     
      if(product.getId() != null){
          update(product);
      }

      log.debug("Création d'un nouveau produit : {}", product);
      product = productService.save(product);

      return product;
   }

   /**
    * Mise à jour d'un produit
    * @param product
    * @return product
    */
   @PutMapping("/update")
   public Product update(@RequestBody Product product){
     
      if(product.getId() == null){
          create(product);
      }

      log.debug("Mise à jour d'un produit : {}", product);
      product = productService.save(product);

      return product;
   }

   /**
    * Récuperer la liste des produits
    * @return products
    */
   @GetMapping("/all")
   public List<Product> getAllProducts(){
      log.debug("Liste des produits");
      return productService.getAllProducts();
   }

   /**
    * Récuperer un produit
    * @param id
    * @return product
    */
   @GetMapping("/{id}")
   public Product getProduct(@PathVariable("id") Long id){
      log.debug("Récuperer le produit : {}", id);
      return productService.getProduct(id);
   }

   /**
    * Suppression d'un produit
    * @param id
    * @return OK
    */
   @DeleteMapping("/{id}")
   public String delete(@PathVariable("id") Long id){
      log.debug("Supprimer le produit : {}", id);
       productService.delete(id);

       return "OK";
   }



}