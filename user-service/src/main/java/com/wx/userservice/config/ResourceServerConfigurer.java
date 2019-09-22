package com.wx.userservice.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationProcessingFilter;

@Configuration
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ResourceServerConfigurer extends ResourceServerConfigurerAdapter {

//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//
//        http.authorizeRequests()
//                .antMatchers("/user/registry").permitAll()
//                .anyRequest().authenticated();
//    }
    @Override
    public void configure(HttpSecurity http) throws Exception {
        //表单登录 方式
//        http.formLogin()
//                .loginPage("/authentication/require")
//                //登录需要经过的url请求
//                .loginProcessingUrl("/authentication/form")
//                .successHandler(myAuthenticationSuccessHandler)
//                .failureHandler(myAuthenticationFailHandler);

        http
                .authorizeRequests()
                .antMatchers("/user/*")
                .authenticated()
                .antMatchers("/oauth/token").permitAll()
                .anyRequest()
                .permitAll()
                .and()
                //关闭跨站请求防护
                .csrf().disable();
    }
}
