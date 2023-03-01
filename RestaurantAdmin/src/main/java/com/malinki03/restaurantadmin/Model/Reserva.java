package com.malinki03.restaurantadmin.Model;

import java.util.Date;

public class Reserva {
    private Date data;
    private Client client;
    private short nombrePersones;
    private Taula taula;

    public Reserva(Date data, Client client, short nombrePersones, Taula taula) {
        this.data = data;
        this.client = client;
        this.nombrePersones = nombrePersones;
        this.taula = taula;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public short getNombrePersones() {
        return nombrePersones;
    }

    public void setNombrePersones(short nombrePersones) {
        this.nombrePersones = nombrePersones;
    }

    public Taula getTaula() {
        return taula;
    }

    public void setTaula(Taula taula) {
        this.taula = taula;
    }

    @Override
    public String toString() {
        return "Reserva{" + "data=" + data + ", client=" + client.toString() + ", nombrePersones=" + nombrePersones + ", taula=" + taula.toString() + '}';
    }
    
}
