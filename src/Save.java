// https://stackoverflow.com/questions/43872241/using-the-command-pattern-with-parameters?utm_source=chatgpt.com
// https://www.baeldung.com/java-command-pattern
public class Save implements Command {
    private KeyboardReader keyboardReader;
    private KeyboardWriter keyboardWriter;
    private AdvancedLine advancedLine;

    private String filePath = "";
    private boolean oopen;

    public Save(KeyboardReader keyboardReader, KeyboardWriter keyboardWriter, AdvancedLine advancedLine, String filePath, boolean oopen){
        this.keyboardReader = keyboardReader;
        this.keyboardWriter = keyboardWriter;
        this.advancedLine = advancedLine;
        this.filePath = filePath;
        this.oopen = oopen;
    }

    @Override
    public void execute(){
        if(oopen) {
            keyboardWriter.writeln("Successfully saved " + filePath + "\n");
        }
        else
            keyboardWriter.writeln("You can't save any file, because you never open anything, use it first:" + "\n" +
                    "open <file>" + "\n" +
                    "then: " + "\n" +
                    "save" + "\n");
    }

    @Override
    public void load(){

    }

    public void setOopen(boolean oopen) {
        this.oopen = oopen;
    }

}
