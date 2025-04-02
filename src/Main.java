import java.util.*;

public class Main {
    public void fromCharToString(){

    }
    public static boolean compareStrings(Scanner scanner, String forChar, String forString){
//        System.out.println(forChar);
//        System.out.println(forString);
        scanner.nextLine();
        if(Objects.equals(forChar, forString))
            return true;
        else
            return false;


//        for(int i = 0; i < forChar.length; i++){
//            char c = forChar[i];
//            System.out.print(c);
//        }
//        System.out.println();
        // if compare is correct - true, if not - false
//        return true;
    }
    public static void exit(Scanner scanner){
        System.out.println("Exiting the program...");
        scanner.close();
        System.exit(0);
    }
    public static void saveas(String line, Scanner scanner){
        // line should be divided, before and after the space
        // if there isn't 2 words = skip
        // first word is "saveas"
        // the second word is path
//        char[] lineToCharArray = line.toCharArray();
//
//        compareStrings(lineToCharArray, "word");
//        if(path.isEmpty()) System.out.println("saveas <file>");
//        char[] charArray1 = path.toCharArray();
//        char[] charArray2 = { '.', 'x', 'm', 'l'};
//        for(int i = 0; i < charArray1.length; i++)
//            try {
//                if (Arrays.toString(charArray1) == Arrays.toString(charArray2))
//                    if (charArray1[i] == '.' && charArray1[i + 1] == 'x' && charArray1[i + 2] == 'm' && charArray1[i + 3] == 'l')
//                        System.out.println("Successfully saved another " + path + "\n.xml is exist");
//                else System.out.println("empty name: " + Arrays.toString(charArray1) + "\nuse something like that: fileName" + Arrays.toString(charArray1));
//            } catch (Exception e) { System.err.println(e.getMessage()); }
    }
    public static void help(Scanner scanner){
        System.out.println("""
                The following commands are supported:
                open <file>    opens <file>
                close          closes currently opened file
                save           saves the currently open file
                saveas <file>  saves the currently open file in <file>
                help           prints this information
                exit           exists the program
                """);
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        // double check for Next and NextLine, it's for saveas especially


        while (scanner.hasNext()) {
            String line = scanner.next(); // String line = scanner.nextLine();
            String[] arrayCommands = {"open", "close", "save", "saveas", "help", "exit", "help open", "help close", "help save", "help saveas", "help help", "help exit"};
            System.out.println(compareStrings(scanner, line, "saveas"));
//            System.out.println(line);
            switch (line){
                case "open": break;
                case "close": break;
                case "save": break;
                case "saveas": saveas(line, scanner); break;
                case "help": break;
                case "exit": break;
                case "help open": break;
                case "help close": break;
                case "help save": break;
                case "help saveas": break;
                case "help help": break;
                case "help exit": break;
                default: System.out.println("Unknown command, for more information write this command:\n> help"); break;
            }
            System.out.print("> ");
        }
    }
}