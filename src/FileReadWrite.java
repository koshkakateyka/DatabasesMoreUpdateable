import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {
    private String fileName;

    public FileReadWrite(String fileName) {
        this.fileName = fileName;
    }

    public void write(){

        int ch;
        try {
            FileReader fileReader = new FileReader(fileName);
            FileWriter fileWriter = new FileWriter(fileName);

            while ((ch = fileReader.read()) != -1){
                fileWriter.write(ch);
            }

            fileWriter.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
