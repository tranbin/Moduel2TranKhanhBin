package ss18_string_regex.bai_tap.validate_ten_lop_hoc;

import java.util.Scanner;

public class ValiNameClass {
    static final String NAME_CLASS = "^[ACP]+[0-9]{4}[GHIKLM]$";

    public static void main(String[] args) {
        System.out.println("Input your name class to check");
        Scanner sc= new Scanner(System.in);
        String name = sc.nextLine();
        if (check(name)){
            System.out.println("CORRECT!");
        }else {
            System.out.println("INCORRECT!");
        }
    }
    public static boolean check(String className){
        return className.matches(NAME_CLASS);
    }
}
