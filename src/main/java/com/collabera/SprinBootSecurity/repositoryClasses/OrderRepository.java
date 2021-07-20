package com.collabera.SprinBootSecurity.repositoryClasses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collabera.SprinBootSecurity.modelClass.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
