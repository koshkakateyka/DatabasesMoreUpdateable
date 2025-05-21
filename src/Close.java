// https://stackoverflow.com/questions/43872241/using-the-command-pattern-with-parameters?utm_source=chatgpt.com
// https://www.baeldung.com/java-command-pattern
public class Close implements Command{
    private KeyboardReader keyboardReader;
    private KeyboardWriter keyboardWriter;
    private AdvancedLine advancedLine;

    private String filePath = "";
    private boolean open;

    public Close(KeyboardReader keyboardReader, KeyboardWriter keyboardWriter, AdvancedLine advancedLine, String filePath, boolean open){
        this.keyboardReader = keyboardReader;
        this.keyboardWriter = keyboardWriter;
        this.advancedLine = advancedLine;
        this.filePath = filePath;
        this.open = open;
    }

    @Override
    public void execute(){
        if(open) {
            keyboardWriter.writeln("Successfully closed " + filePath);
            open = false;
        }
        else
            keyboardWriter.writeln("You can't close any file, because you never open anything, use it first:" + "\n" +
                    "open <file>" + "\n" +
                    "then: " + "\n" +
                    "close");
    }

    @Override
    public void load(){

    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}
