import java.io.*;

public class KeyboardWriter {
    private BufferedWriter writer;

    public KeyboardWriter() {
        writer = new BufferedWriter(new OutputStreamWriter(System.out));
    }

//    private String line;
//
//    public KeyboardWriter(String line){
//        this.line = line;
//    }

    public void write(){
        String line = "123";

        try {
            writer.write(line);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

//    private
//
//
//
//    private void writeKeyboard() {
//        try {
//            log.write(line+"\n");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

}
