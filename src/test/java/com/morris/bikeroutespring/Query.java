package com.morris.bikeroutespring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;

import com.morris.bikeroutespring.entity.Route;

import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.scalars.ExtendedScalars;
import graphql.schema.GraphQLScalarType;

@SpringBootTest
public class Query implements GraphQLQueryResolver {
    private RouteRepository routeRepository;

    GraphQLScalarType longScalar = ExtendedScalars.newAliasedScalar("Long").aliasedScalar(ExtendedScalars.GraphQLLong)
            .build();

    @Autowired
    public Query(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    @Test
    @QueryMapping
    public Iterable<Route> findAllRoute() {
        return routeRepository.findAll();
    }

    public long countRoute() {
        return routeRepository.count();
    }
}
