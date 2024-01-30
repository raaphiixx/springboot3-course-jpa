package com.educandoweb.course.services;

import com.educandoweb.course.entites.Product;
import com.educandoweb.course.repositories.ProductRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRespository productRespository;

    public List<Product> findAll() {
        return productRespository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = productRespository.findById(id);
        return obj.get();
    }
}
