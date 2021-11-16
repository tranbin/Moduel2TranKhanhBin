package ss18_string_regex.bai_tap.validate_phone_number;

import java.util.Scanner;

public class ValidatePhoneNumber {
    static final String PHONE_NUMBER = "^[0-9]{2}+[-]+[0]{1}+[0-9]{9}$";
    public static boolean checkPhoneNumber(String phoneNumber){
        return phoneNumber.matches(PHONE_NUMBER);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your Phone Number to check");
        String number = input.nextLine();
        if (checkPhoneNumber(number)){
            System.out.println("Correct!");
        }else {
            System.out.println("Incorrect");
        }
    }
}
