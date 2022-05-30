package com.htm.springConfiguration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
public class SpringConfiguration{
	
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource source=new DriverManagerDataSource();
		source.setUrl("jdbc:mysql://localhost:3306/htm");
		source.setUsername("root");
		source.setDriverClassName("com.mysql.cj.jdbc.Driver");
		source.setPassword("Shanmukha@5525");
		return source;
	}
	
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver view=new InternalResourceViewResolver();
		view.setPrefix("/WEB-INF/view/");
		view.setSuffix(".jsp");
		return view;
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean(name = "jdbcTemplate")
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate template=new JdbcTemplate(getDataSource());
		return template;
	}
	@Bean
	public JdbcUserDetailsManager detailsManager() {
		return new JdbcUserDetailsManager(getDataSource());
	}
	
	
}
