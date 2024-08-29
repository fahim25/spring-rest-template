package com.springresttemplate.springresttemplate.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.client.RestTemplateBuilderConfigurer;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.util.DefaultUriBuilderFactory;

@Configuration
public class RestTempConfig {

    @Value("${rest.template.rootUrl}")
    String rootUrl;

    @Bean
    RestTemplateBuilder restTemplateBuilder(RestTemplateBuilderConfigurer builderConfigurer) {

        assert rootUrl != null;


        RestTemplateBuilder builder = builderConfigurer.configure(new RestTemplateBuilder());

        DefaultUriBuilderFactory uriBuilderFactory = new
//                DefaultUriBuilderFactory("http://localhost:8080");
                DefaultUriBuilderFactory(rootUrl);

        return builder.uriTemplateHandler(uriBuilderFactory);
    }

}
