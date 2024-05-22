package com.morris.bikeroutespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BikeRouteSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BikeRouteSpringApplication.class, args);
	}

    @Bean
    public graphql.schema.GraphQLScalarType extendedScalarLong() {
        return graphql.scalars.ExtendedScalars.GraphQLLong;
    }
	
    // @GetMapping("/hello2")
    // public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
    //   return String.format("Hello %s!", name);
    // }
}
