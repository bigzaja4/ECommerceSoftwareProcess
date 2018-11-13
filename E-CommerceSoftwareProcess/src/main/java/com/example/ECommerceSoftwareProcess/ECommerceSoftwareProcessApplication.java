package com.example.ECommerceSoftwareProcess;

import java.security.Principal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class ECommerceSoftwareProcessApplication extends WebSecurityConfigurerAdapter{
    
    protected void configure(HttpSecurity http) throws Exception {
      http
        .csrf().disable()
        .antMatcher("/**")
        .authorizeRequests()
          .antMatchers("/", "/login**", "/webjars/**")
          .permitAll()
        .anyRequest()
          .authenticated()
        .and().logout().logoutSuccessUrl("/").permitAll();
    }
    @RequestMapping("/user")
    public Principal user(Principal principal) {
       return principal;
}
	public static void main(String[] args) {
		SpringApplication.run(ECommerceSoftwareProcessApplication.class, args);
	}
}
