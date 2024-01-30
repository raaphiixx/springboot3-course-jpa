package com.educandoweb.course.repositories;

import com.educandoweb.course.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRespository extends JpaRepository<Product, Long> {
}
