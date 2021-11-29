package Test.Vehicle.validate;

import java.util.Scanner;

public class Validate {
    public static boolean validateNameVans(String name) {
        String regVans = "^[0-9]{2}[C]+-+[0-9]{3}+.+[0-9]{2}$";
        return name.matches(regVans);
    }

    public static boolean validateNameCar(String name) {
        String regCar = "^[0-9]{2}+[AB]{1}+-+[0-9]{3}+.+[0-9]{2}$";
        return name.matches(regCar);
    }

    public static boolean validateNameMotobike(String name) {
        String regMotobike = "^[0-9]{2}+-+[A-Z]{1}+[A-Z0-9]{1}+-+[0-9]{3}+.+[0-9]{2}$";
        //: XX-YZ-XXX.XX
        return name.matches(regMotobike);
    }

    public static void main(String[] args) {
        System.out.println("Input your name class to check");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if (validateNameMotobike(name)) {
            System.out.println("CORRECT!");
        } else {
            System.out.println("INCORRECT!");
        }
    }
}
