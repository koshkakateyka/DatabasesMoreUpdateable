import java.io.*;

public class KeyboardWriter {

    private BufferedWriter log;

    public KeyboardWriter(){

        log = new BufferedWriter(new OutputStreamWriter(System.out));
    }

    public String write(String line){
        // https://stackoverflow.com/questions/4405078/how-to-write-to-standard-output-using-bufferedwriter
        try {
            log.write(line+"\n");
            log.flush();
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
