package com.goyadev.mensajesapp;

import java.util.Scanner;

public class MensajesAPP {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("====================");
            System.out.println("Aplicación de Mensajes");
            System.out.println("1. Crear Mensaje");
            System.out.println("2. Listar Mensajes");
            System.out.println("3. Editar Mensajes");
            System.out.println("4. Eliminar Mensajes");
            System.out.println("5. Salir");

            System.out.println("Seleccione una opción: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    MensajesService.createMessage();
                    break;

                case 2:
                    MensajesService.showMessage();
                    break;

                case 3:
                    MensajesService.updateMessage();
                    break;

                case 4:
                    MensajesService.deleteMessage();
                    break;

                default:
                    break;
            }

        } while (opcion != 5);

        /*try {
            conexion.getConnection();
        }catch (Exception e) {
            System.out.println(e);
        }*/
    }
}
