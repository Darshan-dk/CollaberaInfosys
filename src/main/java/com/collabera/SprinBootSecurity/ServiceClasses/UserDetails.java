package com.collabera.SprinBootSecurity.ServiceClasses;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

@Service
public interface UserDetails {

	public Collection<? extends GrantedAuthority> getAuthorities();

	public String getPassword();

	public String getUsername();

	public boolean isAccountNonExpired();

	public boolean isAccountNonLocked();

	public boolean isCredentialsNonExpired();

	public boolean isEnabled();
}
