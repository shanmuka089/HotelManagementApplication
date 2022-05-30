package com.htm.springSecurity;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.session.HttpSessionEventPublisher;

import com.htm.failureHandler.CustomAuthenticationFailureHandler;
import com.htm.successHandler.MyAuthenticationSuccessHandler;

@EnableWebSecurity(debug=false)
public class WebSecurity extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
//		using database
		auth
		.jdbcAuthentication()
		.dataSource(dataSource)
		.passwordEncoder(passwordEncoder);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		.antMatchers("/","/come","/css/**","/images/**","/cust-reg","/features","/about","/support","/cust-regProcess","/forgotPassword","/forgot-process").permitAll()
		.antMatchers("/administrator").hasAuthority("admin")
		.antMatchers("/customer").hasAuthority("cust")
		.antMatchers("/receptionist").hasAuthority("recep")
		.anyRequest().authenticated()
		.and()
		.formLogin().loginPage("/myLogin")
		.loginProcessingUrl("/process-login").permitAll()
		.successHandler(successHandler())
		.failureHandler(failureHandler())
	    .failureUrl("/myLogin?error=true")
		.and()
		.httpBasic()
		.and()
		.rememberMe()  
	    .key("rem-me-key")  
	    .rememberMeParameter("remember")
	    .rememberMeCookieName("rememberlogin")
	    .tokenValiditySeconds(100)
	    .and()
		.logout().deleteCookies("JSESSIONID")
        .logoutUrl("/logout")
        .logoutSuccessUrl("/myLogin?logout=true")
        .invalidateHttpSession(true)
        .permitAll()
        .and()
        .rememberMe().key("uniqueAndSecret").tokenValiditySeconds(60)
        .and()
        .sessionManagement()
        .maximumSessions(1)
        .sessionRegistry(sessionRegistry());
	}
	
	public AuthenticationSuccessHandler successHandler() {
		return new MyAuthenticationSuccessHandler();
	}
	
	public AuthenticationFailureHandler failureHandler() {
		return new CustomAuthenticationFailureHandler();
	}
	
	@Bean
	public SessionRegistry sessionRegistry() {
		return new SessionRegistryImpl();
	}
	
	@Bean
	public ServletListenerRegistrationBean<HttpSessionEventPublisher> httpSessionEventPublisher() {
	    return new ServletListenerRegistrationBean<HttpSessionEventPublisher>(new HttpSessionEventPublisher());
	}
	
}
