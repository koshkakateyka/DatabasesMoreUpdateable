import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        boolean open = false;

        String filePath = "", fileName = "", line = "";

        KeyboardReader keyboardReader = new KeyboardReader();
        FileReadWrite fileReadWrite = new FileReadWrite(filePath);
        ArrayList<String> arrayList = new ArrayList<>();



        while(!line.equals("exit")) {
            line = keyboardReader.getKeyboardInput();
            AdvancedLine advancedLine = new AdvancedLine(line);

            if(advancedLine.byIndex(0).equals("open")){

                // we can use close
                // no rewrite
                // close for close fileWrite
                // and we aren't in open

                // we can use saveas
                // create new file or rewrite
                // the exist, but we have 'save'
                // command for it
                // and we still in open

                // we can use save
                // rewrite the exist
                // and we still in open

                // we can use Databases commands
                // no rewrite
                // no save, it is in memory
                // and we still in open


                // https://docs.vultr.com/java/standard-library/java/lang/String/join
                // catch filePath & fileName
                // fileName
                // from arrays to one variable
                for (int i = 1; i < advancedLine.sizeOf(); i++)
                    arrayList.add(advancedLine.byIndex(i));
                filePath = String.join(" ", arrayList).replaceAll("\"", "");
                // filePath
                FromFilePathToFileName fromFilePathToFileName = new FromFilePathToFileName();
                fileName = fromFilePathToFileName.convert(filePath);

                if(filePath.isEmpty()){
                    // adding variables, if we have spaces in the filePath
                    for (int i = 1; i < advancedLine.sizeOf(); i++)
                        arrayList.add(advancedLine.byIndex(i));
                    // then join it

                    open = true;
                    fileReadWrite.setFileName(fileName);
                }



//                Open command = new Open();
//                command.execute();
//                command.load();
//                open = command.isOpen();
//                arrayList = command.getArrayList1();
//            } else if (advancedLine.byIndex(0).equals("close")) {
//                Close command = new Close(keyboardReader, keyboardWriter, advancedLine, filePath, open);
//                command.execute();
//                open = command.isOpen();

            } else if (advancedLine.byIndex(0).equals("close")) {
                if(open){
                    open = false;
                    System.out.println("closed");
                }
                else {
                    System.out.println("can't close while not opened");
                }
            } else if (advancedLine.byIndex(0).equals("save")) {
                if(!open){
                    System.out.println("can't save while opened");
                }
                else {
                    System.out.println("saved");
                }
            } else if (advancedLine.byIndex(0).equals("saveas")) {
                if(!open){
                    System.out.println("can't saveas while opened");
                }
                else {
                    System.out.println("saved as");
                }
            } else if (advancedLine.byIndex(0).equals("help")) {

            } else if (advancedLine.byIndex(0).equals("exit")) {

            } else {

            }
//            else if (advancedLine.byIndex(0).equals("exit")) {
//                Exit command = new Exit(keyboardWriter);
//                command.execute();
//            } else if (open) {
//                if (advancedLine.byIndex(0).equals("import")) {
//                    Import command = new Import(keyboardReader, keyboardWriter, advancedLine, filePath, open, fileName,
//                            arrayList);
//                    command.execute();
//
//                    for (int i = 0; i < arrayList.size(); i++){
//                        keyboardWriter.writeln(arrayList.get(i));
//                    }
//
//                } else if (advancedLine.byIndex(0).equals("showtables")) {
//                    ShowTables command = new ShowTables();
//                    command.execute();
//                } else if (advancedLine.byIndex(0).equals("describe")) {
//                    Describe command = new Describe();
//                    command.execute();
//                } else if (advancedLine.byIndex(0).equals("print")) {
//                    Print command = new Print();
//                    command.execute();
//                } else if (advancedLine.byIndex(0).equals("export")) {
//                    Export command = new Export();
//                    command.execute();
//                } else if (advancedLine.byIndex(0).equals("select")) {
//                    Select command = new Select();
//                    command.execute();
//                } else if (advancedLine.byIndex(0).equals("addcolumn")) {
//                    AddColumn command = new AddColumn();
//                    command.execute();
//                } else if (advancedLine.byIndex(0).equals("update")) {
//                    Update command = new Update();
//                    command.execute();
//                } else if (advancedLine.byIndex(0).equals("delete")) {
//                    Delete command = new Delete();
//                    command.execute();
//                } else if (advancedLine.byIndex(0).equals("insert")) {
//                    Insert command = new Insert();
//                    command.execute();
//                } else if (advancedLine.byIndex(0).equals("innerjoin")) {
//                    InnerJoin command = new InnerJoin();
//                    command.execute();
//                } else if (advancedLine.byIndex(0).equals("rename")) {
//                    Rename command = new Rename();
//                    command.execute();
//                } else if (advancedLine.byIndex(0).equals("count")) {
//                    Count command = new Count();
//                    command.execute();
//                } else if (advancedLine.byIndex(0).equals("aggregate")) {
//                    Aggregate command = new Aggregate();
//                    command.execute();
//                }
//            // additional commands
//            } else if (advancedLine.byIndex(0).equals("create")) {
//                Create command = new Create();
//                command.execute();
//
//            } else {
//                keyboardWriter.writeln("Unknow command: " + advancedLine.byIndex(0));
//            }
        }
    }
}