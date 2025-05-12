import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(final String...arguments) throws IOException {

//        if (arguments.length < 2)
//        {
//            out.println("\nXML file path/name and XSD file path/name not provided.\n");
//            out.println("\tUSAGE: TwoArgsMain <xmlFilePathAndName> <xsdFilePathAndName>");
//        }
//        else
//        {
//            out.println("The provided XML file is '" + arguments[0]
//                    + "' and the provided XSD file is '" + arguments[1] + "'.");
//        }

        while(true){
            KeyboardReader keyboardReader = new KeyboardReader();
            String inputString = keyboardReader.getKeyboardInput();

            keyboardReader.display(inputString + '\n');
            System.out.println(inputString.length());
//            for(int i = 0; i < inputString.length(); i++){
//                if(findSpace(inputString)){
//                    System.out.print(inputString.charAt(i));
//                }
//                else{
//                    System.out.println();
//                }
//            }

        }




//        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        //            String inputString = input.readLine();

//        keyboardReader.prompt(inputString);


        //        int m1 = Integer.parseInt("55");
//
//        double num = Double.parseDouble("55.2");
//
//
//        try {
//            String inputString = new String();
//            System.out.println("How many total miles did you run? ");
//            inputString = input.readLine();   // Input a String}
//            double miles = Double.parseDouble(inputString); // Convert
//            System.out.println("How many minutes did it take you? ");
//            inputString = input.readLine();   // Input another String
//
//            double minutes = Double.parseDouble(inputString);  // Convert
//            System.out.println("Your average pace was " + minutes/miles + " minutes per mile");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        KeyboardReader cmdline = new KeyboardReader();
//        int m2 = cmdline.getKeyboardInteger();

    }





    //    private static int i = 0;
//    private static String fileName;
//    private static String path;
//    private static String justArray;
//
//    public static void main(String[] args) {
//        String dirPath = System.getProperty("user.dir");
//        File directory = new File(dirPath);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("> ");
//        while (scanner.hasNext()) {
//            String myStr = scanner.nextLine();
//            if(myStr){
//                smartSplit(myStr, 2);
//            }
//
//
//
////            System.out.println(myStr);
////            String line = scanner.nextLine();
////            line = line.toLowerCase();
////
////            switch (){
////                case "open":
////                    i = 0;
////
////                    switch (i){
////                        case 0: break;
////                        case 1: System.out.println("open <file>"); break;
////                        case 2:
////
////                            break;
////                        default: break;
////                    }
////                    break;
////                    case "close":
////                        break;
////                    case "save":
////                        break;
////                    // я понимаю что saveas тут не так должен работать...
////                    case "saveas":
////                        i = 0;
////
////                        switch (i){
////                            case 0: break;
////                            case 1: System.out.println("saveas <file>"); break;
////                            case 2:
////
////                                break;
////                            default: break;
////                        }
////                        break;
////                    case "help":
////                        break;
////                    case "exit":
////                        break;
////                    default: System.out.println("Unknown command, for more information write this "+
////                            "command:\n> help"); break;
////
////            }
//
//            System.out.print("> ");
//        }
//    }
//    public static void smartSplit(String myStr, int words){
//        int i = 0;
//        String regex = " ";
//        String[] myArray = myStr.split(regex);
//        for (String s : myArray) {
//            if(i < words){
//                i++;
//                System.out.println(s);
//            }
//
//        }
//    }


    public static boolean spaceDetector(String inputString){
//        if(inputString.)

        return false;
    }

    public static boolean findSpace(String inputString){
//        System.out.println(inputString.length());
        for(int i = 0; i < inputString.length(); i++){
            if(inputString.charAt(i) == ' '){
                return true;
            }
        }

        return false;
    }
}