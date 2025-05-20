// https://runestone.academy/ns/books/published/javajavajava/a-command-line-interface.html
// https://stackoverflow.com/questions/4405078/how-to-write-to-standard-output-using-bufferedwriter
import java.io.*;

public class KeyboardReader {
    private BufferedReader reader;

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
