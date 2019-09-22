//package com.wx.userservice.config;
//
//import feign.RequestInterceptor;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
////import org.springframework.cloud.security.oauth2.client.feign.OAuth2FeignRequestInterceptor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
////import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
//import org.springframework.security.oauth2.client.OAuth2RestTemplate;
//import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
//
///**
// * Created by IntelliJ IDEA.
// * User: wangxiang
// * Date: 2019/9/22
// * To change this template use File | Settings | File Templates.
// */
//@EnableOAuth2Client
//@EnableConfigurationProperties
//@Configuration
//public class OAuth2ClientConfig {
//
//    /**
//     * 注入客户端的Bean,客户端的信息配置在yml文件中
//     *
//     * @return
//     */
//    @Bean
//    @ConfigurationProperties(prefix = "security.oauth2.client")
//    public ClientCredentialsResourceDetails clientCredentialsResourceDetails() {
//        return new ClientCredentialsResourceDetails();
//    }
//
////    @Bean
////    public RequestInterceptor oauth2FeignRequestInterceptor() {
////        return new OAuth2FeignRequestInterceptor(new DefaultOAuth2ClientContext(), clientCredentialsResourceDetails());
////    }
//
//    /**
//     * OAuth2RestTemplate,用来向资源服务器发起请求的Bean,
//     *
//     * @return
//     */
//    @Bean
//    public OAuth2RestTemplate clientCredentialsRestTemplate() {
//        return new OAuth2RestTemplate(clientCredentialsResourceDetails());
//    }
//
//
//}
