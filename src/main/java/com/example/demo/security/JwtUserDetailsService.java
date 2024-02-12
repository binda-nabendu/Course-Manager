package com.example.demo.security;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public JwtUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        Optional<User> optionalUser = userRepository.findById(userId);
        User u = optionalUser.orElse(null);

        org.springframework.security.core.userdetails.User userRole =
                optionalUser.map(user -> new org.springframework.security.core.userdetails.User(
                user.getId(),
                user.getPassword(),
                // You may need to adjust authorities based on your roles logic
                AuthorityUtils.createAuthorityList(user.getRoles())
        )).orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + userId));

        userRole.getAuthorities().forEach(System.out::println);

        return userRole;
    }

}

