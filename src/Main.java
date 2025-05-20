import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
//        try {
//            BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
//
//            log.write("This will be printed on stdout!\n");
//
//            log.flush();    // my main mistake and stuck here
//                            // do not forget this command
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }

        // beside Scanner, the same things are here
        KeyboardReader keyboardReader = new KeyboardReader();

        String filePath = "";
        boolean oopen = false;

        KeyboardWriter keyboardWriter = new KeyboardWriter();
        keyboardWriter.write("This will be printed on stdout!\n");

        // main loop of cmd work
        while (true) {
            String line = keyboardReader.getKeyboardInput();
            AdvancedLine advancedLine = new AdvancedLine(line);

            if(advancedLine.byIndex(0).equals("open")){
                Open command = new Open(keyboardReader, advancedLine, filePath, oopen);
                command.execute();
                oopen = command.isOopen();
            } else if (advancedLine.byIndex(0).equals("close")) {
                Close command = new Close(keyboardReader, advancedLine, filePath, oopen);
                command.execute();
                oopen = command.isOopen();
            } else if (advancedLine.byIndex(0).equals("save")) {
                Save command = new Save(keyboardReader, advancedLine, filePath, oopen);
                command.execute();
            } else if (advancedLine.byIndex(0).equals("saveas")) {
//                SaveAs command = new SaveAs(keyboardReader, advancedLine, filePath, oopen);
//                command.execute();
            } else if (advancedLine.byIndex(0).equals("help")) {
                Help command = new Help();
                command.execute();
            } else if (advancedLine.byIndex(0).equals("exit")) {
//                Command command = new Exit();
//                command.execute();
            } else {
                keyboardReader.display("Unknown started command" + advancedLine.byIndex(0));
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