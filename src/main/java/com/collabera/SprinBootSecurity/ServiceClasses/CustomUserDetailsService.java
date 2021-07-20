package com.collabera.SprinBootSecurity.ServiceClasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.collabera.SprinBootSecurity.modelClass.CompanyUser;
import com.collabera.SprinBootSecurity.repositoryClasses.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{
	
	@Autowired
    private UserRepository userRepo;
     
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        CompanyUser user = userRepo.findByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new CustomUserDetails(user);
    }
}
