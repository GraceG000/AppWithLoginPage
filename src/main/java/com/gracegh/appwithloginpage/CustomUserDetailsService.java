package com.gracegh.appwithloginpage;

//Step 9: this is the fifth class I created in the project...
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    //Step 11:...
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user =  userRepository.findByUsername(username); //getting the username itself...
            if(user == null){
                throw new UsernameNotFoundException("User Not Found");
            }
        return new CustomUserDetails(user);
    }
}
