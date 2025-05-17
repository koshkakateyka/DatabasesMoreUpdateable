import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OpenFile {
    private String filePath;

    OpenFile(String filePath){
        this.filePath = filePath;
    }

    public void load(){
        FileReader fileReader;
        int ch;
        try{
            fileReader = new FileReader(filePath);

            while ((ch = fileReader.read()) != -1){
                System.out.print(ch);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
