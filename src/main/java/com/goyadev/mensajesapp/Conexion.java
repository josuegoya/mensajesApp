package com.goyadev.mensajesapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection getConnection() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root", "");

            if(conn != null) {
                System.out.println("Conexión Exitosa");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return conn;
    }
}
