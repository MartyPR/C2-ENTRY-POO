package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookingSystem bookingSystem = new BookingSystem();
        bookingSystem.iniciarReserva(scanner);
        scanner.close();
    }
}