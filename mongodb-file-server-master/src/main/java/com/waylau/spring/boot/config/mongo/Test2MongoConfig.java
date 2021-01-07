package com.waylau.spring.boot.config.mongo;

import com.mongodb.MongoClientURI;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

/**
 * @author: fcq
 * @create: 2021-01-07
 */
@Configuration
@ConfigurationProperties(prefix = "spring.data.mongodb.test2")
public class Test2MongoConfig {

    private String uri;

    @Bean(name = "test2MongoTemplate")
    public MongoTemplate test2MongoTemplate(){
        return new MongoTemplate(new SimpleMongoDbFactory(new MongoClientURI(uri)));
    }



}
