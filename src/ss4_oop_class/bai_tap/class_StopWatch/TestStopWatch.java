package ss4_oop_class.bai_tap.class_StopWatch;

import java.time.LocalTime;

public class TestStopWatch {
    public static void main(String[] args) {
        int []a= new int [10];
        for (int i = 0; i < 10; i++) {
            a[i]=(int)(Math.random()*1000);
        }
        LocalTime start = LocalTime.now();
        a=selectionSort(a);
        LocalTime end = LocalTime.now();
        StopWatch sw = new StopWatch(start, end);
        System.out.println("Time: "+sw.getElapsedTime());
        for(int x : a){
            System.out.println(x);
        }
    }

    private static int[] selectionSort(int[] a) {
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[i]){
                    int tempt = a[i];
                    a[i]=a[j];
                    a[j]=tempt;
                }
            }
        }
        return a;
    }
}
