package com.gracegh.appwithloginpage;

//Step 6: This is the fourth class I created in the project... this is where we configure Spring Security...
//Leverage the Spring security for ourselves, so that spring security will handle the security for us. We therefore have to configure it...

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    //Step 8: creating the object of userdetailsservice....
    //UserDetailsService is a default spring security class which will help us to do the authentication itself...
    @Autowired
    UserDetailsService userDetailsService;

    //Giving the configuration details...
    @Bean //step 7:
    AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
     provider.setUserDetailsService(userDetailsService);//we haven't really provided anything here, so we'll have to implement the userDetailsService class...

     //setting your password encoder...
        provider.setPasswordEncoder(new BCryptPasswordEncoder());

        return provider;

    }

}
