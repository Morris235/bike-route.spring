package com.morris.bikeroutespring;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.morris.bikeroutespring.entity.Route;

@SpringBootTest
class BikeRouteSpringApplicationTests {

	@Autowired
	private RouteRepositoryTest routeRepositoryTest;

	// @Test
	// void testJpa(){
	// 	Route r1 = new Route();
	// 	List<Route> all = routeRepositoryTest.findAll();
	// 	System.out.println("find all test : " + all.get(0));
	// }

	@Test
	void testJPAQuery() {
		Route repo = routeRepositoryTest.findByName("rabbit");
		System.out.println("find by name for finish time test : " + repo.getFinishTime());
	}

	@Test
	void contextLoads() {
	}

}
