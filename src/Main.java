import java.util.*;

public class Main {
    public void fromCharToString(){

    }
    public static void exit(Scanner scanner){
        System.out.println("Exiting the program...");
        scanner.close();
        System.exit(0);
    }
    public static void saveas(String line, Scanner scanner){
        switch (line){
            default: System.out.println("Syntax error"); break;
        }
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
//        scanner.nextLine();
    }
    public static void help(Scanner scanner){
        String moreHelp = scanner.nextLine();
        System.out.println("""
                The following commands are supported:
                open <file>    opens <file>
                close          closes currently opened file
                save           saves the currently open file
                saveas <file>  saves the currently open file in <file>
                help           prints this information
                exit           exists the program
                """);
//        switch (moreHelp) { default: System.out.println("HELP [command] \n\ncommand - displays help information on that command."); }

    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.println(line);
            // на будущее себе for i for k array
            if(line == "open") System.out.println();
            else if (line == "close") System.out.println();
            else if (line == "save") exit(scanner);
            else if (line == "saveas") exit(scanner);
            else if (line == "help open") System.out.println();
            else if (line == "help close") exit(scanner);
            else if (line == "help save") System.out.println();
            else if (line == "help saveas") exit(scanner);
            else if (line == "help help") System.out.println();
            else if (line == "help exit") exit(scanner);
            else if (line == "help") System.out.println();
            else if (line == "exit") exit(scanner);
            else System.out.println("Unknown command, for more information write this command:\n> help");
            System.out.print("> ");
        }
    }
}