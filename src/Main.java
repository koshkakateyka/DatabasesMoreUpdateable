import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // beside Scanner, the same things are here
        KeyboardReader keyboardReader = new KeyboardReader();

        // main loop of cmd work
        while (true) {
            String line = keyboardReader.getKeyboardInput();
            AdvancedLine aLine = new AdvancedLine(line);

            boolean lock = false;

            // after all, i wanna add Class MyCmd here
            // open logic
            if(aLine.index(0).equals("open")){
                // for concatinate
                // fo example:
                // input = open "C:\Temp\another
                // but we lost file.xml"
                // so, here is why i use ArrayList
                // https://www.programiz.com/java-programming/arraylist
                ArrayList<String> arrayList = new ArrayList<>();

                for(int i = 1; i < aLine.countOfWords(); i++)
                    arrayList.add(aLine.index(i));

                // https://docs.vultr.com/java/standard-library/java/lang/String/join
                String filePath = String.join(" ", arrayList);
                System.out.println(filePath);

                // https://programmingfundamental.github.io/courses/docs/object-oriented-programming-1-part/laboratory-exercise-10
                OpenFile openFile = new OpenFile(filePath);
                openFile.load();


            }
            // close logic
            else if (aLine.index(0).equals("close")) {
                
            }
            // save logic
            else if (aLine.index(0).equals("save")) {

            }
            // saveas logic
            else if (aLine.index(0).equals("saveas")) {
                // for concatinate
                // fo example:
                // input = open "C:\Temp\another
                // but we lost file.xml"
                // so, here is why i use ArrayList
                // https://www.programiz.com/java-programming/arraylist
                ArrayList<String> arrayList = new ArrayList<>();

                for(int i = 1; i < aLine.countOfWords(); i++)
                    arrayList.add(aLine.index(i));


                // https://docs.vultr.com/java/standard-library/java/lang/String/join
                String result = String.join(" ", arrayList);
                System.out.println(result);

                // https://programmingfundamental.github.io/courses/docs/object-oriented-programming-1-part/laboratory-exercise-10

            }
            // help logic
            else if (aLine.index(0).equals("help")) {
                System.out.println("The following commands are supported:\n" +
                        "open <file> opens <file>\n" +
                        "close closes currently opened file\n" +
                        "save saves the currently open file\n" +
                        "saveas <file> saves the currently open file in <file>\n" +
                        "help prints this information\n" +
                        "exit exists the program");
            }
            // exit logic
            else if (aLine.index(0).equals("exit")) {
                System.out.println("Exiting the program...");
                System.exit(0);
            }


        }
    }
}



























//                        do{
//                            if(conversionLine.trimPlusSplit(0).equals(sequenceOfCommands[j])){
//                                System.out.println("true");
//                                switcher = true;
//                            }
//                        }while(switcher != true || i < conversionLine.countOfWords() && j < sequenceOfCommands.length);
//    public static String idk(){
//        StringTokenizer tokens = new StringTokenizer("Hello I'm your String", " ");
//        String[] splited = new String[tokens.countTokens()];
//        int index = 0;
//        while(tokens.hasMoreTokens()){
//            splited[index] = tokens.nextToken();
//            ++index;
//        }
//
//        for(int i = 0; i < index; i++)
//            return splited[i];
//    }