package case_study.controllers;

import java.util.Scanner;

public class FuramaController {
    public static void displayMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            Scanner sc = new Scanner(System.in);

            switch (sc.nextInt()) {
                case 1: {
                    displayEmployeeMenu();
                    break;
                }
                case 2 :{

                }
            }
        }
    }

    public static void displayEmployeeMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list Employees");
            System.out.println("2. Add new Employee");
            System.out.println("3. Edit Employee");
            System.out.println("4. Return main menu");

            Scanner sc = new Scanner(System.in);

            switch (sc.nextInt()) {
                case 1: {

                }
            }
        }
    }
    public static void displayCustomerMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list Customer");
            System.out.println("2. Add new Customer");
            System.out.println("3. Edit Customer");
            System.out.println("4. Return main menu");

            Scanner sc = new Scanner(System.in);

            switch (sc.nextInt()) {
                case 1: {

                }
            }
        }
    }
    public static void displayFacilityMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list Facility");
            System.out.println("2. Add new Facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");

            Scanner sc = new Scanner(System.in);

            switch (sc.nextInt()) {
                case 1: {

                }
            }
        }

    }
    public static void displayBookingMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new constracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");

            Scanner sc = new Scanner(System.in);

            switch (sc.nextInt()) {
                case 1: {

                }
            }
        }

    }
    public static void displayPromotionMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customers use service");
            System.out.println("2. Add new Facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");

            Scanner sc = new Scanner(System.in);

            switch (sc.nextInt()) {
                case 1: {

                }
            }
        }

    }
}
