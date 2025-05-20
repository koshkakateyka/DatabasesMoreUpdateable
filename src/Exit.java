// https://stackoverflow.com/questions/43872241/using-the-command-pattern-with-parameters?utm_source=chatgpt.com
// https://www.baeldung.com/java-command-pattern
public class Exit implements Command{

    @Override
    public void execute(){
        System.exit(0);
    }
}
