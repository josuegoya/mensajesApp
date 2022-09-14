package com.goyadev.mensajesapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajesDAO {
    private static Connection conn = Conexion.getConnection();
    public static void createMessage(Mensajes message) {

        PreparedStatement ps = null;

        try {
            String query = "INSERT INTO mensaje (mensaje, autor, fecha_mensaje) VALUES (?,?, current_timestamp())";
            ps = conn.prepareStatement(query);

            ps.setString(1, message.getMessage());
            ps.setString(2, message.getAutorMessage());
            ps.executeUpdate();

            System.out.println("Mensaje creado correctamente");

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void readMessage() {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String query = "SELECT * FROM mensaje";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id_mensaje"));
                System.out.println("MENSAJE: " + rs.getString("mensaje"));
                System.out.println("AUTOR: " + rs.getString("autor"));
                System.out.println("FECHA: " + rs.getString("fecha_mensaje"));
                System.out.println("");
            }
        } catch (SQLException e) {
            System.out.println("No se pudieron recuperar los mensajes");
            System.out.println(e);
        }
    }

    public static void deleteMessage(int idMessage) {
        PreparedStatement ps = null;

        try {
            String query = "DELETE FROM mensaje WHERE id_mensaje = ?";
            ps = conn.prepareStatement(query);

            ps.setInt(1, idMessage);
            ps.executeUpdate();

            System.out.println("El mensaje se borro correctamente");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void updateMessage(Mensajes message) {
        PreparedStatement ps = null;

        try {
            String query = "UPDATE mensaje SET mensaje = ? WHERE id_mensaje = ?";
            ps = conn.prepareStatement(query);

            ps.setString(1, message.getMessage());
            ps.setInt(2, message.getIdMessage());
            ps.executeUpdate();

            System.out.println("El mensaje fue actualizado correctamente");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
