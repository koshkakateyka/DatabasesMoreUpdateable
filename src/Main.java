import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // beside Scanner, the same things are here
        KeyboardReader keyboardReader = new KeyboardReader();
        boolean open = false;
        String filePath = "";

        MyCmd myCmd = new MyCmd(true, filePath);

        // main loop of cmd work
        while (true) {
            myCmd.open();
            myCmd.close();
            myCmd.save();
            myCmd.saveas();
            myCmd.help();
            myCmd.exit();
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