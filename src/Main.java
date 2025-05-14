//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Objects;
//import java.util.Scanner;
//import java.io.File;

// https://docs.oracle.com/javase/tutorial/essential/io/index.html
import java.io.*;


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



// https://docs.oracle.com/javase/tutorial/essential/io/bytestreams.html
public class Main {
    public static void main(String[] args) throws IOException, RuntimeException {

        FileInputStream in = null;
        FileOutputStream out = null;

        

        try {
            in = new FileInputStream("xanadu.txt");
            out = new FileOutputStream("outagain.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }

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

        CopyBytes copyBytes = new CopyBytes();


    }
}
