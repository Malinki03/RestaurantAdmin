package com.malinki03.restaurantadmin.Model;
public class Taula {
    
    private int capacitat;

    public Taula(int capacitat) {
        this.capacitat = capacitat;
    }

    public int getCapacitat() {
        return capacitat;
    }

    @Override
    public String toString() {
        return "Taula{" + "capacitat=" + capacitat + '}';
    }

}
