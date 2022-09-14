package com.goyadev.mensajesapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection conn;

    private Conexion() {
    }

    public static Connection getConnection() {
        if(conn == null) {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root", "");

            } catch (SQLException e) {
                System.out.println(e);
            }
        }

        return conn;
    }
}
