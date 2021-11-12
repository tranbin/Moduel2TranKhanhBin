package ss17_io_test_file2.bai_tap.quan_li_san_pham_luu_ra_file_nhi_phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public void writeFile(String link, List<Product> list) {
        File file = new File(link);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        List<Product> listProduct = new ArrayList<>();
        if (file.length() > 0) {
            listProduct = readFile(link);
        }
        for (Product list1 : list) {
            listProduct.add(list1);
        }
        try {
            fileOutputStream = new FileOutputStream(file, false);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(listProduct);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Product> readFile(String link) {
        File file = new File(link);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        List<Product> list = new ArrayList<>();
        try {
            if (file.length() > 0) {
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);
                list = (List<Product>) objectInputStream.readObject();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}
