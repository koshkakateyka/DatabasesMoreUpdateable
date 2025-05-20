import java.io.*;

public class KeyboardWriter {
    private String line;

    public KeyboardWriter(String line){
        this.line = line;
    }

    public String write(){
        try {
            BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));

            log.write(line+"\n");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return line+"\n";
    }

//    private String readKeyboard() {
//        String line = "";
//
//        try {
//            line = reader.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return line;
//    }

}
