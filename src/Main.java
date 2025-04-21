
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
public class Main {
    private static String fileName;
    public static void main(String[] args) {
        // directory path
        String dirPath = System.getProperty("user.dir");
        // check existed files here
        File directory = new File(dirPath);
        File[] files = directory.listFiles();

        if (files != null)
            for (File file : files)
                if (findXMLfile(file.getName()))
                    System.out.println(file.getName());

        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        while (scanner.hasNext()) {
            String line = scanner.next();
            switch (line) {
                case "open":
                    fileName = scanner.next();
                    System.out.println(fileName);
                    break;
                case "close": break;
                case "save": break;
                case "saveas":
                    fileName = scanner.next();
                    if(fileName.isEmpty()) {
                        System.out.println("saveas <file>");
                        break;
                    }
                    char[] charArray1 = fileName.toCharArray();
                    char[] charArray2 = { '.', 'x', 'm', 'l'};
                    for(int i = 0; i < charArray1.length; i++){
                        try {
                            if (Arrays.toString(charArray1) == Arrays.toString(charArray2)) {
                                if (charArray1[i] == '.')
                                    if (charArray1[i + 1] == 'x')
                                        if (charArray1[i + 2] == 'm')
                                            if (charArray1[i + 3] == 'l') {
                                                System.out.println("Successfully saved another " +
                                                        fileName + "\n");
                                                System.out.println(".xml is exist");
                                            }
                            }
                            else{
                                System.out.println("empty name: " + charArray1);
                                System.out.println("use something like that: fileName" + charArray1);
                            }
                        }catch (Exception e){
                            System.err.println(e.getMessage());
                        }
                    }
                    scanner.nextLine();
                    break;
                case "help":
                    scanner.nextLine();
                    System.out.println("The following commands are supported:\n" +
                            "open <file>    opens <file>\n" +
                            "close          closes currently opened file\n" +
                            "save           saves the currently open file\n" +
                            "saveas <file>  saves the currently open file in <file>\n" +
                            "help           prints this information\n" +
                            "exit           exists the program\n");
                    break;
                case "exit":
                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Unknown command, for more information write this "+
                            "command:\n> help");
                    break;
            }
            System.out.print("> ");
        }
    }

    public static boolean findXMLfile(String fileName){
        if(fileName.endsWith(".xml"))
            return true;
        else
            return false;
    }
}