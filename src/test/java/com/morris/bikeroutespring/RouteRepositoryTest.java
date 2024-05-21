package com.morris.bikeroutespring;

import org.springframework.data.jpa.repository.JpaRepository;

import com.morris.bikeroutespring.entity.RouteEntity;

public interface RouteRepositoryTest extends JpaRepository<RouteEntity, String>{
    // JPA에 레포지터리의 메서드명을 분석하여 쿼리를 만들고 실행하는 기능이 있다.
    RouteEntity findByName(String name); 
    RouteEntity findByIdAndName(String id, String name);
}
