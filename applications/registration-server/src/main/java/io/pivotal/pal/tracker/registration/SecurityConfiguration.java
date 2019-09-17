package io.pivotal.pal.tracker.registration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
<<<<<<< HEAD
            .authorizeRequests()
            .anyRequest().permitAll()
            .and()
            .csrf().disable();
    }

}
=======
                .authorizeRequests()
                .anyRequest().permitAll()
                .and()
                .csrf().disable();
    }

}
>>>>>>> c19ee764c9199e70db9f795d9f2f18e143ccc39a
