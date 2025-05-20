// https://stackoverflow.com/questions/43872241/using-the-command-pattern-with-parameters?utm_source=chatgpt.com
// https://www.baeldung.com/java-command-pattern
public class Close implements Command{
    private KeyboardReader keyboardReader;
    private AdvancedLine advancedLine;

    private String filePath = "";
    private boolean oopen;

    public Close(KeyboardReader keyboardReader, AdvancedLine advancedLine, String filePath, boolean oopen){
        this.keyboardReader = keyboardReader;
        this.advancedLine = advancedLine;
        this.filePath = filePath;
        this.oopen = oopen;
    }

    @Override
    public void execute(){
        if(oopen) {
            keyboardReader.display("Successfully closed " + filePath + "\n");
            oopen = false;
        }
        else
            keyboardReader.display("You can't close any file, because you never open anything, use it first:" + "\n" +
                    "open <file>" + "\n" +
                    "then: " + "\n" +
                    "close" + "\n");
    }

    public boolean isOopen() {
        return oopen;
    }

    public void setOopen(boolean oopen) {
        this.oopen = oopen;
    }
}
