package Test.Vehicle.service;

import Test.Vehicle.data.ReadAndWriteFile;
import Test.Vehicle.model.Motobike;
import Test.Vehicle.validate.Validate;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceMotobike {
    public  final  String PATH_HANG_SX ="src/Test/Vehicle/data/HangSX.csv";
    public final String PATH = "src/Test/Vehicle/data/xeMay.csv";
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

    Scanner scanner = new Scanner(System.in);

    public Motobike create(){
        List<String> list = readAndWriteFile.readFile(PATH_HANG_SX);
        String bks ="";
        do {
            System.out.println("Ban hay nhap BKS");
            bks = scanner.nextLine();
        }while(!Validate.validateNameMotobike(bks));
        System.out.println("Ban hay chon id hang sx");
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        int index = Integer.parseInt(scanner.nextLine());
        String name = list.get(index-1).split("_")[1];
        System.out.println("Ban hay nhap Years");
        int yesrs = Integer.parseInt(scanner.nextLine());
        System.out.println("Ban hya nhap namePeople");
        String namePeople = scanner.nextLine();
        System.out.println("Ban hay nhap wattage");
        int wattage = Integer.parseInt(scanner.nextLine());
        return new Motobike(bks,name,yesrs,namePeople,wattage);
    }
    public void add(){
        List<Motobike> list1 = getListMotobike();
        list1.add(create());
        readAndWriteFile.writeFile(PATH, list1);
    }

    public List<Motobike> getListMotobike(){
        List<Motobike> list = new ArrayList<>();
        List<String> listString = readAndWriteFile.readFile(PATH);
        for (String list1: listString){
            String arr[] = list1.split(",");
            list.add(new Motobike(arr[0], arr[1],Integer.parseInt(arr[2]), arr[3],Integer.parseInt(arr[4])));
        }
        return list;
    }

    public void display(){
        List<Motobike> listCar = getListMotobike();
        for (Motobike list: listCar){
            System.out.println(list);
        }
    }
    public boolean searchBks(String bks){
        List<Motobike> listCar = getListMotobike();
        int size = listCar.size();
        for(int i = 0;i<size;i++){
            if(bks.equals(listCar.get(i).getBsk())){
                return true;
            }
        }
        return false;
    }
    public void delete(String bks){
        List<Motobike> listCar = getListMotobike();
        for(int i = 0;i<listCar.size();i++){
            if(bks.equals(listCar.get(i).getBsk())){
                System.out.println("Da xoa " +listCar.get(i).toString());
                listCar.remove(i);
            }
        }
        readAndWriteFile.writeFile(PATH,listCar);
    }
}
