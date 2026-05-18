package security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import exceptions.NotFoundException;
import lombok.RequiredArgsConstructor;
import models.User;
import repositories.UserRepository;

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
