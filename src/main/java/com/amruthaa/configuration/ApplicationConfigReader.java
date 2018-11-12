package com.amruthaa.configuration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@Data
public class ApplicationConfigReader {
    @Value("${inputqueue.exchange.name}")
    private String inputQueueExchange;

    @Value("${inputqueue.queue.name}")
    private String inputQueueName;

    @Value("${inputqueue.routing.key}")
    private String inputQueueKey;

    @Value("${outputqueue.exchange.name}")
    private String outputQueueExchange;

    @Value("${outputqueue.queue.name}")
    private String outputQueueName;

    @Value("${outputqueue.routing.key}")
    private String outputQueueKey;

    @Value("${upload.folder}")
    private String uploadFolder;

    @Value("${upload.file.max.size}")
    private int uploadFileMaxSize;

    @Value("${api1.url}")
    private String api1Url;

    @Value("${api2.url}")
    private String api2Url;

    @Value("${api3.url}")
    private String api3Url;

    // All getters and setters are generated by lombok
}