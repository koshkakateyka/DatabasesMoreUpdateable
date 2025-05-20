public class Main {
    public static void main(String[] args) {
        // beside Scanner, the same things are here
        KeyboardReader keyboardReader = new KeyboardReader();

        // beside System.out.println();
        KeyboardWriter keyboardWriter = new KeyboardWriter();

        String filePath = "";
//        String fileName = "";
        boolean oopen = false;

        // main loop of cmd work
        while (true) {
            String line = keyboardReader.getKeyboardInput();
            AdvancedLine advancedLine = new AdvancedLine(line);

            if(advancedLine.byIndex(0).equals("open")){
                Open command = new Open(keyboardReader, keyboardWriter, advancedLine, filePath, oopen);
                command.execute();
                oopen = command.isOopen();
            }
            else if (advancedLine.byIndex(0).equals("close")) {
                Close command = new Close(keyboardReader, keyboardWriter, advancedLine, filePath, oopen);
                command.execute();
                oopen = command.isOopen();
            }
            else if (advancedLine.byIndex(0).equals("save")) {
                Save command = new Save(keyboardReader, keyboardWriter, advancedLine, filePath, oopen);
                command.execute();
            }
            else if (advancedLine.byIndex(0).equals("saveas")) {
                SaveAs command = new SaveAs(keyboardReader, keyboardWriter, advancedLine, filePath, oopen);
                command.execute();
            }
            else if (advancedLine.byIndex(0).equals("help")) {
                Help command = new Help(keyboardReader, keyboardWriter);
                command.execute();
            }
            else if (advancedLine.byIndex(0).equals("exit")) {
                Command command = new Exit(keyboardWriter);
                command.execute();
            }
            else {
                keyboardWriter.write("Unknown command: " + advancedLine.byIndex(0));
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