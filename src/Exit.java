// https://stackoverflow.com/questions/43872241/using-the-command-pattern-with-parameters?utm_source=chatgpt.com
// https://www.baeldung.com/java-command-pattern
public class Exit implements Command{
    private KeyboardWriter keyboardWriter;

    public Exit(KeyboardWriter keyboardWriter){
        this.keyboardWriter = keyboardWriter;
    }

    @Override
    public void execute(){
        keyboardWriter.writeln("Exiting the program...");
    }

    @Override
    public void load(){

    }
}
