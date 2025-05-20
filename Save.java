// https://stackoverflow.com/questions/43872241/using-the-command-pattern-with-parameters?utm_source=chatgpt.com
// https://www.baeldung.com/java-command-pattern
public class Save implements Command {
    private KeyboardReader keyboardReader;
    private AdvancedLine advancedLine;

    private String filePath = "";
    private boolean oopen;

    public Save(KeyboardReader keyboardReader, AdvancedLine advancedLine, String filePath, boolean oopen){
        this.keyboardReader = keyboardReader;
        this.advancedLine = advancedLine;
        this.filePath = filePath;
        this.oopen = oopen;
    }

    @Override
    public void execute(){
        if(oopen) {
            keyboardReader.display("Successfully saved " + filePath + "\n");
        }
        else
            keyboardReader.display("You can't save any file, because you never open anything, use it first:" + "\n" +
                    "open <file>" + "\n" +
                    "then: " + "\n" +
                    "save" + "\n");
    }

    public void setOopen(boolean oopen) {
        this.oopen = oopen;
    }

}
