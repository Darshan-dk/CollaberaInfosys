package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.CompanyUser;

@Repository
public interface UserRepository extends JpaRepository<CompanyUser, Long>  {

	@Query("SELECT u FROM User u WHERE u.email = ?1")
	public CompanyUser findByEmail(String email); 
}
