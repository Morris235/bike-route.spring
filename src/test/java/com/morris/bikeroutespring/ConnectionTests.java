package com.morris.bikeroutespring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTests {

    @Test
    public void DBTest() throws Exception {
        // Assuming the MariaDB JDBC driver is included in the classpath

        Class.forName("org.mariadb.jdbc.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/bike_route",
                "admin",
                "1187");

        Assertions.assertNotNull(connection);

        connection.close();
    }
}