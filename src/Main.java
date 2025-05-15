import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] sequenceOfCommands = {"open", "close", "save", "saveas", "help", "exit"};

        // main loop of cmd work
        while (true) {
            String line = scanner.nextLine();
            ConversionLine conversionLine = new ConversionLine(line);

            for(int i = 0; i < conversionLine.countOfWords(); i++){
                if(conversionLine.trimPlusSplit(i).equals("open")){
                    System.out.println("opened");
                } else if (conversionLine.trimPlusSplit(i).equals("close")) {
                    System.out.println("closed");
                } else if (conversionLine.trimPlusSplit(i).equals("save")) {
                    System.out.println("saved");
                } else if (conversionLine.trimPlusSplit(i).equals("saveas")) {
                    System.out.println("saved as");
                } else if (conversionLine.trimPlusSplit(i).equals("help")) {
                    System.out.println("helped");
                } else if (conversionLine.trimPlusSplit(i).equals("exit")) {
                    System.out.println("exited");
                }

            }

        }
    }
    public static boolean compare(String First, String Second){
        if(First.equals(Second)){
            return true;
        }
        return false;
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