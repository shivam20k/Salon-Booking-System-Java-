package com.ShivamKadam;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SalonSystem salonSystem = new SalonSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to the Salon Booking System");
            System.out.println("1. Add Salon Shop");
            System.out.println("2. Select Salon and Book Appointment");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter Salon name: ");
                    String salonName = scanner.nextLine();
                    salonSystem.addSalon(salonName);
                    break;
                case 2:
                    System.out.println("Available Salons:");
                    List<Salon> salons = salonSystem.getSalons();
                    for (Salon salon : salons) {
                        System.out.println("- " + salon.getName());
                    }

                    System.out.print("Enter Salon name to select: ");
                    String selectedSalonName = scanner.nextLine();
                    Salon selectedSalon = salonSystem.selectSalon(selectedSalonName);
                    if (selectedSalon != null) {
                        System.out.println("Available Time Slots for " + selectedSalon.getName() + ":");
                        for (String timeSlot : selectedSalon.getAvailableTimeSlots()) {
                            System.out.println("- " + timeSlot);
                        }

                        System.out.print("Enter time slot to book: ");
                        String timeSlotToBook = scanner.nextLine();
                        if (selectedSalon.bookTimeSlot(timeSlotToBook)) {
                            System.out.println("Appointment booked successfully for " + timeSlotToBook);
                        } else {
                            System.out.println("Time slot not available. Please choose another time slot.");
                        }
                    } else {
                        System.out.println("Salon not found.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
