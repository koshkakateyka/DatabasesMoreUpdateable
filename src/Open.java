public class Open implements Command {
    private KeyboardReader keyboardReader = new KeyboardReader();
    private String line = keyboardReader.getKeyboardInput();
    private AdvancedLine aLine = new AdvancedLine(line);

    private boolean oopen;

    public Open(){

    }

    @Override
    public void execute(){

    }
}
