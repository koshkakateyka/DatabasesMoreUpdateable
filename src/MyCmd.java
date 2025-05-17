public class MyCmd {
    private KeyboardReader keyboardReader = new KeyboardReader();

    private String line = keyboardReader.getKeyboardInput();
    private AdvancedLine aLine = new AdvancedLine(line);
}
