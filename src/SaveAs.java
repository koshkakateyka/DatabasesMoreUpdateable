// https://stackoverflow.com/questions/43872241/using-the-command-pattern-with-parameters?utm_source=chatgpt.com
// https://www.baeldung.com/java-command-pattern
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SaveAs implements Command {
    private KeyboardReader keyboardReader;
    private KeyboardWriter keyboardWriter;
    private AdvancedLine advancedLine;

    private String filePath = "";
    private boolean oopen;

    public SaveAs(KeyboardReader keyboardReader, KeyboardWriter keyboardWriter, AdvancedLine advancedLine, String filePath, boolean oopen){
        this.keyboardReader = keyboardReader;
        this.keyboardWriter = keyboardWriter;
        this.advancedLine = advancedLine;
        this.filePath = filePath;
        this.oopen = oopen;
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
            // https://programmingfundamental.github.io/courses/docs/object-oriented-programming-1-part/laboratory-exercise-10
            try{
                BufferedReader bufferedReader;
                String data;
                bufferedReader = new BufferedReader(new FileReader(filePath));

                while ((data = bufferedReader.readLine()) != null){
                    System.out.println(data);
                    //                arrayList.add()
                    //                return data[iindex];
                }

                bufferedReader.close();
            } catch (IOException e) {
                // i can't write the name of file, only the path
                keyboardWriter.writeln("Can't open/find this path: " + filePath + "\n");
            }

            oopen = true;
        }
        else {
            keyboardWriter.writeln("FilePath is empty\n");
        }
    }

    @Override
    public void load(){

    }

    public boolean isOopen() {
        return oopen;
    }

    public void setOopen(boolean oopen) {
        this.oopen = oopen;
    }
}
