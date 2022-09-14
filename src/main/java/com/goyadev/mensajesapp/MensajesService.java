package com.goyadev.mensajesapp;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MensajesService {
    public static void createMessage() {
        Scanner input = new Scanner(System.in);

        System.out.println("Escribe tu mensaje");
        String text = input.nextLine();

        System.out.println("Tu nombre");
        String autor = input.nextLine();

        Mensajes message = new Mensajes();
        message.setMessage(text);
        message.setAutorMessage(autor);

        MensajesDAO.createMessage(message);
    }

    public static void showMessage() {
        MensajesDAO.readMessage();
    }

    public static void deleteMessage() {
        Scanner input = new Scanner(System.in);

        System.out.println("¿Cual es el identificador del mensaje a borrar?");
        int id = input.nextInt();

        MensajesDAO.deleteMessage(id);
    }

    public static void updateMessage() {
        Scanner input = new Scanner(System.in);

        System.out.println("¿Cual es el identificador del mensaje que desea actualizar?");
        int id = Integer.parseInt(input.nextLine());

        System.out.println("Escriba el nuevo mensaje: ");
        String newMessage = input.nextLine();

        Mensajes message = new Mensajes();
        message.setIdMessage(id);
        message.setMessage(newMessage);

        MensajesDAO.updateMessage(message);
    }
}
