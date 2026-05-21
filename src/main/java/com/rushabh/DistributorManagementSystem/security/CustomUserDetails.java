package com.rushabh.DistributorManagementSystem.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rushabh.DistributorManagementSystem.exceptions.NotFoundException;
import lombok.RequiredArgsConstructor;
import com.rushabh.DistributorManagementSystem.models.User;
import com.rushabh.DistributorManagementSystem.repositories.UserRepository;

@Service
@RequiredArgsConstructor
public class CustomUserDetails implements UserDetailsService {
	
	
	private final UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(username)
                .orElseThrow(() -> new NotFoundException("User Email Not Found"));

        return AuthUser.builder()
                .user(user)
                .build();

}
    
}
