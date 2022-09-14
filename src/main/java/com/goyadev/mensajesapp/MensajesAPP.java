package com.goyadev.mensajesapp;

public class MensajesAPP {

    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        
        try {
            conexion.getConnection();
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
