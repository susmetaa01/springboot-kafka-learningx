package com.example.springbootkafkalearning2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/*
errors faced

WhiteLabelError → check the topic name correctly
This error handler cannot process 'SerializationException's directly; please consider configuring an 'ErrorHandlingDeserializer' → spring.kafka.consumer.value-deserializer=org.springframework.kafka.support.serializer.ErrorHandlingDeserializer spring.kafka.consumer.properties.spring.deserializer.value.delegate.class=org.springframework.kafka.support.serializer.JsonDeserializer
Why to use private + setter/ getter methods than using public directly → https://dzone.com/articles/why-should-i-write-getters-and-setters
Error connecting to node macos-jwv17mlx72:9092 (id: 0 rack: null) → restart the server

 */

/*

Execution flow of the spring application
The @springbootApplication annotation is where the flow begins. @springbootApplication = @Configuration + @EnableAutoConfig + @ComponentScan
The @Config is responsible for the @Bean creation and stuff
The @ComponentScan is responsible for scanning all the packages that fall under the main application package
@EnableAutoConfig will validate the existence of certain classes


 */

/*

To get the kafka server up and running
	bin/zookeeper-server-start.sh config/zookeeper.properties
	bin/kafka-server-start.sh config/server.properties
https://kafka.apache.org/quickstart

 */

@SpringBootApplication
public class SpringbootKafkaLearning2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootKafkaLearning2Application.class, args);
	}

}
