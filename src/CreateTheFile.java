import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateTheFile {
    // используем private, потому-что это правило. Называется "модификатор доступа" в классах
    private String text;
    private String fileName;
    private boolean debuggingInformation;

    CreateTheFile(String text, String fileName) throws FileNotFoundException, IOException {
        this.text = text;
        this.fileName = fileName;
    }

//    public void setText(String text) {
//        this.text = text;
//    }
//
//    public void setFileName(String fileName) {
//        this.fileName = fileName;
//    }

    // ахуеть, решилось само
    public void saveTheFile(){
        try{
            byte[] content = text.getBytes();

            File file = new File(fileName);
            FileOutputStream outputStream = new FileOutputStream(file);
            outputStream.write(content);
            outputStream.close();
            System.out.println("File " + fileName + " created correctly");
        }catch(IOException e){
            System.err.println("File " + fileName + " isn't created, the error is: " + e);
            e.printStackTrace();
        }
    }

}
