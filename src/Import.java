import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Import implements Command{
    private KeyboardReader keyboardReader;
    private KeyboardWriter keyboardWriter;
    private AdvancedLine advancedLine;
    private String fileName;
    private ArrayList<String> arrayList1;

    private String filePath = "";
    private boolean open;

    public Import(KeyboardReader keyboardReader, KeyboardWriter keyboardWriter, AdvancedLine advancedLine,
                String filePath, boolean open, String fileName, ArrayList<String> arrayList1){
        this.keyboardReader = keyboardReader;
        this.keyboardWriter = keyboardWriter;
        this.advancedLine = advancedLine;
        this.filePath = filePath;
        this.open = open;
        this.fileName = fileName;
        this.arrayList1 = arrayList1;
    }

    @Override
    public void execute(){
        // for concatinate
        // fo example:
        // input = open "C:\Temp\another
        // but we lost file.xml"
        // so, here is why i use ArrayList
        // https://www.programiz.com/java-programming/arraylist
        ArrayList<String> arrayList = new ArrayList<>();

        // counting tokens after command open
        for (int i = 1; i < advancedLine.sizeOf(); i++)
            arrayList.add(advancedLine.byIndex(i));

        // https://docs.vultr.com/java/standard-library/java/lang/String/join
        // never use one quote like that: open 'filePath'
        filePath = String.join(" ", arrayList).replaceAll("\"", "");
        if(!filePath.isEmpty()){
            // keyboardWriter.writeln("Successfully opened " + filePath + "\n");

            FromFilePathToFileName fromFilePathToFileName = new FromFilePathToFileName();
            String fileName = fromFilePathToFileName.convert(filePath);



            // https://programmingfundamental.github.io/courses/docs/object-oriented-programming-1-part/laboratory-exercise-10
            try{
                BufferedReader bufferedReader;
                String data;

                bufferedReader = new BufferedReader(new FileReader(filePath));
                keyboardWriter.writeln("Successfully imported  " + fileName);

                arrayList1 = new ArrayList<>();

                while ((data = bufferedReader.readLine()) != null){
                    arrayList1.add(data);
                }

                bufferedReader.close();
            } catch (IOException e) {
                keyboardWriter.writeln("Can't open: " + fileName + " " + "\n" +
                        "or find the file by this path: " + filePath);
            }
            open = true;
        }
        else {
            keyboardWriter.writeln("FilePath is empty");
        }
    }

    @Override
    public void load(){

    }

    public ArrayList<String> getArrayList1() {
        return arrayList1;
    }

}
