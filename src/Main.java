// https://programmingfundamental.github.io/courses/docs/object-oriented-programming-1-part/laboratory-exercise-10
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        // for file

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
                    Import command = new Import();
                    command.execute();
                } else if (advancedLine.byIndex(0).equals("showtables")) {
                    ShowTables command = new ShowTables();
                    command.execute();
                } else if (advancedLine.byIndex(0).equals("describe")) {
                    Describe command = new Describe();
                    command.execute();
                } else if (advancedLine.byIndex(0).equals("print")) {
                    Print command = new Print();
                    command.execute();
                } else if (advancedLine.byIndex(0).equals("export")) {
                    Export command = new Export();
                    command.execute();
                } else if (advancedLine.byIndex(0).equals("select")) {
                    Select command = new Select();
                    command.execute();
                } else if (advancedLine.byIndex(0).equals("addcolumn")) {
                    AddColumn command = new AddColumn();
                    command.execute();
                } else if (advancedLine.byIndex(0).equals("update")) {
                    Update command = new Update();
                    command.execute();
                } else if (advancedLine.byIndex(0).equals("delete")) {
                    Delete command = new Delete();
                    command.execute();
                } else if (advancedLine.byIndex(0).equals("insert")) {
                    Insert command = new Insert();
                    command.execute();
                } else if (advancedLine.byIndex(0).equals("innerjoin")) {
                    InnerJoin command = new InnerJoin();
                    command.execute();
                } else if (advancedLine.byIndex(0).equals("rename")) {
                    Rename command = new Rename();
                    command.execute();
                } else if (advancedLine.byIndex(0).equals("count")) {
                    Count command = new Count();
                    command.execute();
                } else if (advancedLine.byIndex(0).equals("aggregate")) {
                    Aggregate command = new Aggregate();
                    command.execute();
                }
            } else {
                keyboardWriter.writeln("Unknow command: " + advancedLine.byIndex(0));
            }
        }
    }
}