package mobile_phone_manager.util;


import mobile_phone_manager.model.XachTay;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RWFileXT {
    final static String PATH = "src/mobile_phone_manager/data/DTXachTay.csv";
    public static void write(List<XachTay> xachTayList, boolean append){
        File file = new File(PATH);
        FileWriter fileWriter= null ;
        BufferedWriter bufferedWriter=  null;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (XachTay xachTay:xachTayList){
                bufferedWriter.write(xachTay.getInfo());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<XachTay> read(){
        List<XachTay> xachTays = new ArrayList<>();
        File file = new File(PATH);
        FileReader fileReader= null ;
        BufferedReader bufferedReader=  null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] array = null;
            while ((line = bufferedReader.readLine())!=null){
                array = line.split(",");
                XachTay xachTay = new XachTay(Integer.parseInt(array[0]),array[1],
                        Integer.parseInt(array[2]),Integer.parseInt(array[3]),array[4],array[5],array[6]);
                xachTays.add(xachTay);
                //int id, String name, int price, int quantity, String produce, String quocGia, String trangThai
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return xachTays;
    }
}

