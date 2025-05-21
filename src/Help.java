public class Help implements Command {
    private KeyboardReader keyboardReader;
    private KeyboardWriter keyboardWriter;

    public Help(KeyboardReader keyboardReader, KeyboardWriter keyboardWriter) {
        this.keyboardReader = keyboardReader;
        this.keyboardWriter = keyboardWriter;
    }

    @Override
    public void execute(){
        keyboardWriter.writeln("The following commands are supported:\n" +
                "open <file> opens <file>\n" +
                "close closes currently opened file\n" +
                "save saves the currently open file\n" +
                "saveas <file> saves the currently open file in <file>\n" +
                "help prints this information\n" +
                "exit exists the program");
    }

    @Override
    public void load(){

    }
}
