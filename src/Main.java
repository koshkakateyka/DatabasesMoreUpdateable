import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(final String... arguments) throws IOException {

//        // for strings
//        KeyboardReader keyboardReader = new KeyboardReader();
//        String inputString = keyboardReader.getKeyboardInput();
//
//        // for integers
//        KeyboardReader cmdline = new KeyboardReader();
//        int m = cmdline.getKeyboardInteger();
//
//
//        keyboardReader.display(inputString + '\n');
//        cmdline.display(m);

        KeyboardReader keyboardReader = new KeyboardReader();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        keyboardReader.display(keyboardReader.readKeyboard());


    }
}