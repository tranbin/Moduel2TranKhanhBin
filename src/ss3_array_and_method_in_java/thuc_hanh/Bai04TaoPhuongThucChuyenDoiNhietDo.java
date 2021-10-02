package ss3_array_and_method_in_java.thuc_hanh;

import java.util.Scanner;

public class Bai04TaoPhuongThucChuyenDoiNhietDo {
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập vào độ F");
                    fahrenheit= input.nextDouble();
                    System.out.println("F-C :" + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Nhập vào độ C");
                    celsius = input.nextDouble();
                    System.out.println("C-F : " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice !=0);
    }
}
