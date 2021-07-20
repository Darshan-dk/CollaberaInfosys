package com.collabera.SprinBootSecurity.repositoryClasses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collabera.SprinBootSecurity.modelClass.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
