package com.example.demo.sec.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import com.example.demo.sec.domain.JwtTokenProvider;
import com.example.demo.sec.filter.CustomAuthenticationEntryPoint;
import com.example.demo.sec.filter.JwtAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter{
	@Autowired JwtTokenProvider jwtTokenProvider;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		System.out.println("왜 안됨?");
		http.httpBasic().disable()
		.csrf().disable()
        	.cors()
        .and()
			.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
		.and()
			.authorizeRequests()
			.antMatchers("/*/login", "/*/signUp").permitAll()
			.anyRequest().hasRole("USER")  // 그외 나머지 요청은 모두 인증된 회원만 접근 가능
		.and()
			.exceptionHandling().authenticationEntryPoint(new CustomAuthenticationEntryPoint())
		.and()
			.addFilterBefore(new JwtAuthenticationFilter(jwtTokenProvider), UsernamePasswordAuthenticationFilter.class)
			
			;
	}
	@Bean
	   public CorsConfigurationSource corsConfigurationSource() {
	       CorsConfiguration configuration = new CorsConfiguration();
	
	       configuration.addAllowedOrigin("*");
	       configuration.addAllowedMethod("*");
	       configuration.addAllowedHeader("*");
	       configuration.setAllowCredentials(true);
	       configuration.setMaxAge(3600L);
	       UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	       source.registerCorsConfiguration("/**", configuration);
	       return source;
	   }
}
