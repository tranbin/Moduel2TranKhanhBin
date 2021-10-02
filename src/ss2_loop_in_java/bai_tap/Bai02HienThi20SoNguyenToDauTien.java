package ss2_loop_in_java.bai_tap;

public class Bai02HienThi20SoNguyenToDauTien {
    public static void main(String args[]) {
      /*  int status = 1;
        int num = 2;
        for (int i = 2; i <= 20; ) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.println(num);
                i++;
            }
            status = 1;
            num++;*/

      // cách 2
        int count = 0 ;
        int n = 2;
        int temp = 1 ;
        while (temp <=20){
            for (int i = 2 ; i <= Math.sqrt(n);i++){
                if (n % i == 0 ){
                    count = count + 1;
                }
            }
            if (count == 0){
                System.out.println(n);
                temp = temp + 1;
            }else {
                count = 0;
            }
            n++;
        }
    }
}

