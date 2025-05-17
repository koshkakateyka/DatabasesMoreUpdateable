// https://programmingfundamental.github.io/courses/docs/object-oriented-programming-1-part/laboratory-exercise-10
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class OpenFile {
    private ArrayList<String> arrayList = new ArrayList<>();
//
//    OpenFile(String filePath){
//        this.filePath = filePath;
//    }
    OpenFile(String filePath){
        try{
            BufferedReader bufferedReader;
            String data;
            bufferedReader = new BufferedReader(new FileReader(filePath));

            while ((data = bufferedReader.readLine()) != null){
                System.out.println(data);
//                arrayList.add()
//                return data[iindex];
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Can't open/find this file: " + filePath);
        }
    }

    public void output(/*int iindex*/){

    }

}
