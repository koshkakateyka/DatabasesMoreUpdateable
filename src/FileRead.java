import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    private String fileName;

    public FileRead(String fileName) {
        this.fileName = fileName;
    }

    public void read(){

        int ch;
        try {
            FileReader fileReader = new FileReader(fileName);

            while ((ch = fileReader.read()) != -1){
                System.out.println(ch);
            }

            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
