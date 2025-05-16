import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // main loop of cmd work
        while (true) {
            String line = scanner.nextLine();
            AdvancedLine aLine = new AdvancedLine(line);

            if(aLine.index(0).equals("open")){
                for(int i = 1; i < aLine.countOfWords(); i++)
                    System.out.println(aLine.index(i));
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