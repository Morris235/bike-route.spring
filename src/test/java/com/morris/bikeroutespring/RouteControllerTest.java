package com.morris.bikeroutespring;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.tester.AutoConfigureGraphQlTester;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.graphql.test.tester.GraphQlTester;

@SpringBootTest
@AutoConfigureGraphQlTester
public class RouteControllerTest {
    @Autowired
    private GraphQlTester graphQlTester;


    @DisplayName("1. 게시글 1개 가져오기")
    @Test
    void test_1(){
        this.graphQlTester.documentName("route")
                .variable("id", 1L)
                .execute()
                .path("route.name")
                .entity(String.class)
                .isEqualTo("rabbit");
    }
}