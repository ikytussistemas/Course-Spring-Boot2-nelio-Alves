package com.ikytus.course.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ikytus.course.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
