package com.goyadev.mensajesapp;

public class Mensajes {
    private int idMessage;
    private String message;
    private String autorMessage;
    private String datemessage;

    public Mensajes() {
    }

    public Mensajes(String message, String autorMensaje, String fechaMensaje) {
        this.message = message;
        this.autorMessage = autorMensaje;
        this.datemessage = fechaMensaje;
    }

    public int getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(int idMessage) {
        this.idMessage = idMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAutorMessage() {
        return autorMessage;
    }

    public void setAutorMessage(String autorMessage) {
        this.autorMessage = autorMessage;
    }

    public String getDatemessage() {
        return datemessage;
    }

    public void setDatemessage(String datemessage) {
        this.datemessage = datemessage;
    }
}
