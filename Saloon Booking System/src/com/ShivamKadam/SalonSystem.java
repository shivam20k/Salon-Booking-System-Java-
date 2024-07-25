package com.ShivamKadam;

import java.util.ArrayList;
import java.util.List;

public class SalonSystem {
    private List<Salon> salons;

    public SalonSystem() {
        this.salons = new ArrayList<>();
    }

    public void addSalon(String name) {
        Salon salon = new Salon(name);
        salons.add(salon);
        System.out.println("Salon " + name + " added successfully.");
    }

    public List<Salon> getSalons() {
        return salons;
    }

    public Salon selectSalon(String name) {
        for (Salon salon : salons) {
            if (salon.getName().equalsIgnoreCase(name)) {
                return salon;
            }
        }
        return null;
    }
}
