package com.enit.demo.sec;

import javax.xml.bind.DatatypeConverter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;




import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter{



	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
        .csrf().disable();
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		http.authorizeRequests().antMatchers("/login/","/register","/all", "/projects","/project/launch/","/addCarr","/getAllCarr","/removeCarr/**","/careers/**","/removeCarr/{userName}","/getAllCert","/addCert","/removeCert/**","/addComp","/getAllComp","/removeComp/**","/skills/**","/Certs/**").permitAll();
		//http.authorizeRequests().antMatchers("/addCarr/","/deleteCarr").hasAuthority("USER");
		http.addFilterBefore(new JWTAuthorisationFilter(), UsernamePasswordAuthenticationFilter.class);
}
	
	public static Claims decodeJWT(String jwt) {
		Claims claims=Jwts.parser()
				.setSigningKey(DatatypeConverter.parseBase64Binary("zaineb@aridhi.com"))
				.parseClaimsJws(jwt).getBody();
		return claims;
		
	}



}
