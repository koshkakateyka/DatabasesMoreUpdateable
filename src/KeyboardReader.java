// https://runestone.academy/ns/books/published/javajavajava/a-command-line-interface.html
import java.io.*;

public class KeyboardReader {
    // Attribute
    private BufferedReader reader;

    // Constructor
    public KeyboardReader() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    // Getters
    public String getKeyboardInput() {
        return readKeyboard();
    }

    public int getKeyboardInteger() {
        return Integer.parseInt(readKeyboard());
    }

    public double getKeyboardDouble() {
        return Double.parseDouble(readKeyboard());
    }

    // Setters
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
}
