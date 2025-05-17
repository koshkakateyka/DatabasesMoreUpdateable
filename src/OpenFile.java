import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class OpenFile {
    private String filePath;

    OpenFile(String filePath){
        this.filePath = filePath;
    }

    public void load(){
        BufferedReader bufferedReader;

        String line;
        try{
            bufferedReader = new BufferedReader(new FileReader(filePath));

            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
