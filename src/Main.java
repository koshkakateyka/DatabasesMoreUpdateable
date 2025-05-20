import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // beside Scanner, the same things are here
        KeyboardReader keyboardReader = new KeyboardReader();
        // beside System.out.println();
        KeyboardWriter keyboardWriter = new KeyboardWriter();
        // variables
        String filePath = "";
        boolean open = false;
        String fileName = "";

        // for reading files
        ArrayList<String> arrayList1 = new ArrayList<>();



        // main loop of cmd work
        String line = "";
        while(!line.equals("exit")) {
            line = keyboardReader.getKeyboardInput();
            AdvancedLine advancedLine = new AdvancedLine(line);

            if(advancedLine.byIndex(0).equals("open")){
                Open command = new Open(keyboardReader, keyboardWriter, advancedLine, filePath, open, fileName,
                        arrayList1);
                command.execute();
                open = command.isOpen();
                // omg
                arrayList1 = command.getArrayList1();

                // SHOW AFTER READ
                for (int i = 0; i < arrayList1.size(); i++){
                    keyboardWriter.writeln(arrayList1.get(i));
                }

                // initialize for continue codeGenerate after
                CodeGenerate codeGenerate = new CodeGenerate();

//                line = keyboardReader.getKeyboardInput();
//                advancedLine = new AdvancedLine(line);
//                if(advancedLine.byIndex(0).equals("import")){
//                    System.out.println("import");
//                }


            } else if (advancedLine.byIndex(0).equals("close")) {
                Close command = new Close(keyboardReader, keyboardWriter, advancedLine, filePath, open);
                command.execute();
                open = command.isOpen();
            } else if (advancedLine.byIndex(0).equals("exit")) {
                Exit command = new Exit(keyboardWriter);
                command.execute();
            } else if (open) {
                if (advancedLine.byIndex(0).equals("import")) {
                    System.out.println("import");
                } else if (advancedLine.byIndex(0).equals("showtables")) {
                    
                } else if (advancedLine.byIndex(0).equals("describe")) {

                } else if (advancedLine.byIndex(0).equals("print")) {

                } else if (advancedLine.byIndex(0).equals("export")) {

                } else if (advancedLine.byIndex(0).equals("select")) {

                } else if (advancedLine.byIndex(0).equals("addcolumn")) {

                } else if (advancedLine.byIndex(0).equals("update")) {

                } else if (advancedLine.byIndex(0).equals("delete")) {

                } else if (advancedLine.byIndex(0).equals("insert")) {

                } else if (advancedLine.byIndex(0).equals("innerjoin")) {

                } else if (advancedLine.byIndex(0).equals("rename")) {

                } else if (advancedLine.byIndex(0).equals("count")) {

                } else if (advancedLine.byIndex(0).equals("aggregate")) {

                }
            } else {

            }
        }
    }
}