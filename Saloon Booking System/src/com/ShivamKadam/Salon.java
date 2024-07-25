package com.ShivamKadam;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private String name;
    private List<String> availableTimeSlots;

    public Salon(String name) {
        this.name = name;
        this.availableTimeSlots = new ArrayList<>();
        // Adding some default time slots
        this.availableTimeSlots.add("10:00 AM");
        this.availableTimeSlots.add("11:00 AM");
        this.availableTimeSlots.add("12:00 PM");
        this.availableTimeSlots.add("01:00 PM");
        this.availableTimeSlots.add("02:00 PM");
        this.availableTimeSlots.add("03:00 PM");
    }

    public String getName() {
        return name;
    }

    public List<String> getAvailableTimeSlots() {
        return availableTimeSlots;
    }

    public boolean bookTimeSlot(String timeSlot) {
        if (availableTimeSlots.contains(timeSlot)) {
            availableTimeSlots.remove(timeSlot);
            return true;
        }
        return false;
    }
}
