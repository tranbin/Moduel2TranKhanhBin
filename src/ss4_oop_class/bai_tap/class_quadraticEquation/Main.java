package ss4_oop_class.bai_tap.class_quadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 3 số a,b,c");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        System.out.println("----------------------------");
        if (qe.getDiscriminant() < 0){
            System.out.println("Không có nghiệm");
        }else if (qe.getDiscriminant() ==0){
            System.out.println("Phương trình có nghiệm :" +qe.getRoot1());
        }else {
            System.out.println("Phương trình có nghiệm :");
            System.out.println("Delta " + qe.getDiscriminant());
            System.out.println("Nghiệm 1 : " +qe.getRoot1());
            System.out.println("Nghiệm 2 : " +qe.getRoot2());
        }
    }
}
