import java.util.*;

public class Main {
    public void fromCharToString(){

    }
    public static void main(String[] args) {
        // takes from here:
        //
        // https://www.geeksforgeeks.org/
        // scanner-hasnextline-method-in-java-with-examples/
        Scanner scanner = new Scanner(System.in);

        // hasNext is better for using every line by line, better for work
        // than hasNextLine, which takes whole the line
        System.out.print("> ");
        // or maybe using hasNextLine()... idk yet

        while (scanner.hasNext()) {

            String line = scanner.next();
            switch (line) {
                case "open":
                    // function
                    // probably class.something
                    break;
                case "close":
                    // function
                    break;
                case "save":
                    // same
                    break;
                case "saveas":
                    // after space = variable path
                    String path = scanner.next();

                    // playing with path.
                    // if nothing after saveas
                    if(path.isEmpty()) {
                        System.out.println("saveas <file>");
                        break;
                    }

                    // https://stackoverflow.com/questions/18925161/char-vs-string-in-java

                    // charArray1.length

                    // https://docs.oracle.com/javase/tutorial/java/data/characters.html
                    char[] charArray1 = path.toCharArray();
                    // https://docs.oracle.com/javase/tutorial/java/data/characters.html
                    char[] charArray2 = { '.', 'x', 'm', 'l'};
                    for(int i = 0; i < charArray1.length; i++){
                        // i used exception, because if you will write save .xm =
                        // = program will fall,
                        // without program fall, i have an exception for save the fall
                        // try-catch(exception e){serr(e.getmess)}
                        try {
                            // try to fix it:
                            // .xml - bad save, empty name
                            // n.xml - good save, no empty name
                            // i remember it since c++ and char plays, no need to explain

//                            System.out.println(Arrays.toString(charArray1) + " == " + Arrays.toString(charArray2));

                            // что-то имеет -
                            // прохо, в другом случае - не проходит
                            // не проходит и ошибка... не знаю
                            if (Arrays.toString(charArray1) == Arrays.toString(charArray2)) {

                                if (charArray1[i] == '.')
                                    if (charArray1[i + 1] == 'x')
                                        if (charArray1[i + 2] == 'm')
                                            if (charArray1[i + 3] == 'l') {

                                                System.out.println("Successfully saved another " +
                                                        path + "\n");
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

//                    System.out.println((char)path);
//
//                    // https://docs.oracle.com/javase/tutorial/java/data/characters.html
//                    char[] charArray2 = { '.', 'x', 'm', 'l'};
//                    if(Objects.equals((char)path, charArray)){
//                        System.out.println("Hello World!");
//                    }
//                    else if (scanner.hasNext()) {
//                        System.out.println("Hello World!");
//                    } // can add something
                    // for example, if it is not xml file - will not work
                    // check if .xml at the of file




                    // trash after dots -> "saveas <file> ..."
                    scanner.nextLine();
//                    if(line){
//
//                        break;
//                    }
//                    else{
//                        System.out.println("saveas <file>");
//                        break;
//                    }
                    break;

                case "help":
                    // "scanner.nextLine();" is for:
                    // if you will write "help" - everything will be fine
                    // but if you will write "help saveas "C:\" exit" - it means
                    // that after help, everything after help - will not work
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
                    // like from c++ "exit(0);" or after the int main(), use
                    // "return 0;"
                    //
                    // https://stackoverflow.com/questions/30898773/
                    // how-do-i-use-system-exit-in-java
                    System.exit(0);
                default:
                    System.out.println("Unknown command, for more information write this "+
                            "command:\n> help");
                    break;
            }
            System.out.print("> ");
        }
    }
}