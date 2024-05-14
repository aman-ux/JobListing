package com.aman.JobListing;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.MongoConverter;

@Configuration
public class MongoConfig {

    @Bean
    public MongoTemplate mongoTemplate(MongoClient mongoClient) {
        return new MongoTemplate(mongoClient, "aman"); // Replace "yourDatabaseName" with your actual database name
    }
    @Bean
    public MongoClient mongoClient() {
        return MongoClients.create("mongodb+srv://kaushalaman04:Ak04%40JEE%23@aman.g6munhq.mongodb.net/?retryWrites=true&w=majority&appName=aman"); // Replace "yourMongoDBConnectionURI" with your actual MongoDB connection URI
    }
    @Bean
    public MongoConverter mongoConverter(MongoTemplate mongoTemplate) {
        return mongoTemplate.getConverter();
    }
}
