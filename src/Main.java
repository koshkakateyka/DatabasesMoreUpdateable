import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // beside Scanner, the same things are here
        KeyboardReader keyboardReader = new KeyboardReader();
        boolean open = false;
        String filePath = "";

        String line = keyboardReader.getKeyboardInput();
        AdvancedLine aLine = new AdvancedLine(line);
        MyCmd myCmd = new MyCmd(aLine, filePath, true);

        // main loop of cmd work
        while (true) {
            if(aLine.index(0).equals("open")){
                open = true;
                myCmd.open(true);
                open = false;
            }
//            else if (open == true)
            else if (aLine.index(0).equals("close")){
                open = false;
                myCmd.close(false);
            }



            else if (aLine.index(0).equals("save"))
                myCmd.save();
            else if (aLine.index(0).equals("saveas"))
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