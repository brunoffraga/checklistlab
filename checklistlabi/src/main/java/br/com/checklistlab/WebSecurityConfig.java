package br.com.checklistlab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig  extends WebSecurityConfigurerAdapter{

    @Autowired
    private javax.sql.DataSource dataSource;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        .authorizeRequests()
        .antMatchers("/home")
            .permitAll()
        .anyRequest()
            .authenticated()
        .and()
        .formLogin(form -> form
            .loginPage("/login")
            .defaultSuccessUrl("/usuario/pedido", true)
            .permitAll()
        )
        .logout(logout -> {

        });
    }

    @Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		

		auth.jdbcAuthentication()
            .dataSource(dataSource)
            .passwordEncoder(encoder);
	}
    
}

/**
create table users(
    username varchar(50) not null primary key,
    password varchar(200) not null,
    enabled boolean not null
);

create table authorities (
    username varchar(50) not null,
    authority varchar(50) not null,
    constraint fk_authorities_users foreign key(username) references users(username)
);
create unique index ix_auth_username on authorities (username,authority);

 */