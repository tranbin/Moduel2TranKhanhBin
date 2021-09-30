package ss1_introduce_to_java.thuc_hanh;

import java.util.Scanner;

public class ChiSoBMI {
    public static void main(String[] args) {
        double canNang, chieuCao, chiSoBMI;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cân nặng tính bằng kg");
        canNang = scanner.nextDouble();
        System.out.println("Nhập chiều cao tính bằng mét");
        chieuCao = scanner.nextDouble();
        chiSoBMI = canNang / Math.pow(chieuCao,2);
        System.out.println("Chỉ số BMI là : " + chiSoBMI);
        if (chiSoBMI < 18.5) {
            System.out.println("Qúa gầy");
        } else if (chiSoBMI < 25.0) {
            System.out.println("Ok nè");
        } else if (chiSoBMI < 30.0) {
            System.out.println("Hơi béo rồi");
        } else {
            System.out.println("Qúa béo");
        }
    }
}
