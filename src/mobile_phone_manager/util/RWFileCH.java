package mobile_phone_manager.util;

import mobile_phone_manager.model.ChinhHang;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RWFileCH {
    final static String PATH = "src/mobile_phone_manager/data/DTChinhHang.csv";
    public static void write(List<ChinhHang> chinhHangList, boolean append){
        File file = new File(PATH);
        FileWriter fileWriter= null ;
        BufferedWriter bufferedWriter=  null;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (ChinhHang chinhHang:chinhHangList){
                bufferedWriter.write(chinhHang.getInfo());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<ChinhHang> read(){
        List<ChinhHang> chinhHangs = new ArrayList<>();
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
                ChinhHang chinhHang = new ChinhHang(Integer.parseInt(array[0]),array[1],
                        Integer.parseInt(array[2]),Integer.parseInt(array[3]),array[4],array[5],array[6]);
                chinhHangs.add(chinhHang);
                //int id, String name, int price, int quantity, String produce, String quocGia, String trangThai
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return chinhHangs;
    }
}
