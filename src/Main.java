import java.util.*;

public class Main {
    public void fromCharToString(){

    }
    public static void exit(Scanner scanner){
        System.out.println("Exiting the program...");
        scanner.close();
        System.exit(0);
    }
    public static void saveas(Scanner scanner){
        String path = scanner.next();
        if(path.isEmpty()) System.out.println("saveas <file>");
        char[] charArray1 = path.toCharArray();
        char[] charArray2 = { '.', 'x', 'm', 'l'};
        for(int i = 0; i < charArray1.length; i++)
            try {
                if (Arrays.toString(charArray1) == Arrays.toString(charArray2))
                    if (charArray1[i] == '.')
                        if (charArray1[i + 1] == 'x')
                            if (charArray1[i + 2] == 'm')
                                if (charArray1[i + 3] == 'l') System.out.println("Successfully saved another " + path + "\n.xml is exist");
                else System.out.println("empty name: " + Arrays.toString(charArray1) + "\nuse something like that: fileName" + Arrays.toString(charArray1));
            } catch (Exception e) { System.err.println(e.getMessage()); }
        scanner.nextLine();
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        while (scanner.hasNext()) { // or maybe using hasNextLine()... idk yet
            String line = scanner.next();
            switch (line) {
                case "open": break;
                case "close": break;
                case "save": break;
                case "saveas": saveas(scanner); break;
                case "help": scanner.nextLine(); break;
                case "exit": exit(scanner);
                default: System.out.println("Unknown command, for more information write this command:\n> help"); break;
            }
            System.out.print("> ");
        }
    }
}