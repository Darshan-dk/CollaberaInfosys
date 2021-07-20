package com.collabera.SprinBootSecurity.repositoryClasses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.collabera.SprinBootSecurity.modelClass.CompanyUser;

@Repository

public interface UserRepository  extends JpaRepository<CompanyUser, Long>
 {
	@Query("select u from User  where u.email = ?1")
	public CompanyUser findByEmail(String email); 

}
