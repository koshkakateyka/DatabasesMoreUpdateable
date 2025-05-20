// https://runestone.academy/ns/books/published/javajavajava/a-command-line-interface.html
// https://stackoverflow.com/questions/4405078/how-to-write-to-standard-output-using-bufferedwriter
import java.io.*;

public class KeyboardReader {
    private BufferedWriter writer;
    private BufferedReader reader;

//    public Writer KeyboardWriter() {
//        writer = new BufferedWriter(new OutputStreamWriter(System.out));
//        return writer;
//    }

    public KeyboardReader() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String getKeyboardInput() {
        return readKeyboard();
    }

    public int getKeyboardInteger() {
        return Integer.parseInt(readKeyboard());
    }

    public double getKeyboardDouble() {
        return Double.parseDouble(readKeyboard());
    }

    public void prompt(String s) {
        System.out.print(s);
    }

    public void display(String s) {
        System.out.print(s);
    }

    private String readKeyboard() {
        String line = "";

        try {
            line = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }

    String writeKeyboard(String line){
        try {
            writer.write(line+"\n");
            writer.flush();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return writer.toString();
    }


}
