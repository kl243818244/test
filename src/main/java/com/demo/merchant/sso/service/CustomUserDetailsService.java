package com.demo.merchant.sso.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.demo.merchant.sso.domain.UserQo;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
    	UserQo userQo = new UserQo();
    	
    	userQo.setId(1L);
    	
    	userQo.setName("test");
    	
    	BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
    	
    	userQo.setPassword(bCryptPasswordEncoder.encode("test"));
    	
        if (userQo == null) {
            throw new UsernameNotFoundException("UserName " + userName + " not found");
        }
        return new SecurityUser(userQo);
    }
}
