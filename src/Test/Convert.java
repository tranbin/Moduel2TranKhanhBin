package Test;

import java.util.Stack;

public class Convert {
    public void convert(int num){
        Stack<Integer> stack = new Stack<Integer>();

        while (num != 0) {

            //thực hiện phép chia lấy phần dư cho 2.

            int d = num % 2;

            // thêm vào stack.

            stack.push(d);

            num /= 2;

        }
        while (!(stack.isEmpty())) {

            System.out.print(stack.pop());

        }
    }
}
