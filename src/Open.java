// https://stackoverflow.com/questions/43872241/using-the-command-pattern-with-parameters?utm_source=chatgpt.com
// https://www.baeldung.com/java-command-pattern
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Open implements Command {
//    private KeyboardReader keyboardReader;
//    private KeyboardWriter keyboardWriter;
//    private AdvancedLine advancedLine;
//    private ArrayList<String> arrayList;
//    private String fileName;
//
//
//    private String filePath = "";
//    private boolean open;
//
//    public Open(KeyboardReader keyboardReader, KeyboardWriter keyboardWriter, AdvancedLine advancedLine,
//                String filePath, boolean open, String fileName, ArrayList<String> arrayList){
//        this.keyboardReader = keyboardReader;
//        this.keyboardWriter = keyboardWriter;
//        this.advancedLine = advancedLine;
//        this.arrayList = arrayList;
//        this.filePath = filePath;
//        this.open = open;
//        this.fileName = fileName;
//
//    }

    @Override
    public void execute(){

    }

    @Override
    public void load(){
        KeyboardReader keyboardReader = new KeyboardReader();
        KeyboardWriter keyboardWriter = new KeyboardWriter();
        ArrayList<String> arrayList = new ArrayList<>();

        boolean open = false;
        String filePath = "";
//        String fileName = "";

        String line = "";

        line = keyboardReader.getKeyboardInput();
        AdvancedLine advancedLine = new AdvancedLine(line);

        // counting tokens after command open
        for (int i = 1; i < advancedLine.sizeOf(); i++)
            arrayList.add(advancedLine.byIndex(i));

        // https://docs.vultr.com/java/standard-library/java/lang/String/join
        // never use one quote like that: open 'filePath'
        filePath = String.join(" ", arrayList).replaceAll("\"", "");

        if(!filePath.isEmpty()){
            FromFilePathToFileName fromFilePathToFileName = new FromFilePathToFileName();
            String fileName = fromFilePathToFileName.convert(filePath);

            try{
                BufferedReader bufferedReader;

                bufferedReader = new BufferedReader(new FileReader(filePath));
                keyboardWriter.writeln("Successfully opened " + fileName);

                bufferedReader.close();
            } catch (IOException e) {
                keyboardWriter.writeln("Can't open: " + fileName + " " + "\n" +
                        "or find the file by this path: " + filePath + "\n" +
                        "If you want to create a file, please, white"+"\n" +
                        "create \"anyName.xml\"");
            }
            open = true;
        }
        else {
            keyboardWriter.writeln("open <file>");
        }
    }

//    public boolean isOpen() {
//        return open;
//    }
//
//    public void setOpen(boolean open) {
//        this.open = open;
//    }
//
//    public String getFilePath() {
//        return filePath;
//    }
//
//    public String getFileName() {
//        return fileName;
//    }
//
//    public ArrayList<String> getArrayList1() {
//        return arrayList1;
//    }
}
