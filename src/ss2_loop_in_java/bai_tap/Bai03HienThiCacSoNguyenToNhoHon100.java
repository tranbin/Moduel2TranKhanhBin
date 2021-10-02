package ss2_loop_in_java.bai_tap;

public class Bai03HienThiCacSoNguyenToNhoHon100 {
    // hien thi ra so nguyen to nho hon 100
    public static void main(String[] args) {
        int n = 2 ;
        int count = 1 ;
        boolean kiemTra = true;
        while (n <= 100){
            for (int i  =2 ; i <= Math.sqrt(n); i ++){
                if (n % i == 0){
                    kiemTra = false;
                    break;
                }
            }
            if (kiemTra){
                System.out.println("Số nguyên tố thứ " + count + " là : " +n);
                count = count + 1 ;
            }
            n = n + 1 ;
            kiemTra = true;
        }
    }

    //hien thi ra 100 so nguyen to
    /*public static void main(String[] args) {
        int n = 2 ;
        int temp = 1 ;
        int count  = 0 ;
        while (temp < 100){
            for(int i = 2 ; i < Math.sqrt(n);i++){
                if ( n % i == 0){
                    count = count + 1 ;
                }
            }
            if (count == 0 ){
                System.out.println(n);
                temp = temp + 1 ;
            }else {
                count  = 0;
            }
            n ++;
        }
    }*/

}
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int num = 0;
        String primeNumbers = "";
        System.out.println("Nhập vào số n:");
        int n = scanner.nextInt();
        scanner.close();
        for (i = 1; i <= n; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Các số nguyên tố từ 1 đến " + n + " là:");
        System.out.println(primeNumbers);
    }
}*/
