import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = null;
        String second = null;
        boolean open = false;
        boolean saveas = false;

        // main loop of cmd work
        while (true) {
            String line = scanner.nextLine();
            AdvancedLine aLine = new AdvancedLine(line);

//            for(int i = 0; i < conversionLine.countOfWords(); i++){
            if(aLine.index(0).equals("open")){
                System.out.println("opened");
                open = true;
            } else if (aLine.index(0).equals("close")) {
                if(open == true){
                    System.out.println("closed");
                    open = false;
                }
                else {
                    System.out.println("You didn't open anything, nothing for close");
                }
            } else if (aLine.index(0).equals("save")) {
                System.out.println("saved");
            } else if (aLine.index(0).equals("saveas")) {
                System.out.println("saved as");
                for (int i = 1; i < aLine.countOfWords(); i++){
                    String fileDirrect = aLine.index(i);
                    System.out.println(fileDirrect);
                }
            } else if (aLine.index(0).equals("help")) {
                System.out.println("helped");
            } else if (aLine.index(0).equals("exit")) {
                System.out.println("exited");
                System.exit(0);
            }
//            }
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