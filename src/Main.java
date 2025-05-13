import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;
import java.io.File;

// another class

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

public class Main {
    public static void main(final String... arguments) throws IOException {


        // variant 1
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // variant 2
        KeyboardReader keyboardReader = new KeyboardReader();

        // for remember
        //  input
        //keyboardReader.getKeyboardInput();
        //  output
        //keyboardReader.display("string");

        keyboardReader.display(keyboardReader.getKeyboardInput());


    }
}