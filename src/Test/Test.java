package Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> stacks = new Stack<>();
        stacks.push(1);
        stacks.push(3);
        stacks.push(4);
        System.out.println(stacks);
//        System.out.println(stacks.pop());  // 4
//        System.out.println(stacks.pop());  // 3
//        System.out.println(stacks.pop());  // 1

        while (!stacks.isEmpty()){
            System.out.println("phần tử: "+ stacks.pop());
        }
    }
}
