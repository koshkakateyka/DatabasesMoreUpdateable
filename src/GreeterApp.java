public class GreeterApp
{   private KeyboardReader reader;
    public GreeterApp()
    {   reader = new KeyboardReader();
    } // GreeterApp()
    public void run()
    {   String name = "";
        reader.prompt("Please input your name here > ");
        name = reader.getKeyboardInput();
        reader.display(greet(name) + "\n");
    } // run()
    public String greet(String name)
    {   return "Hi " + name + " nice to meet you.";
    } // greet()
    public static void main(String args[])
    {   GreeterApp app = new GreeterApp();
        app.run();
    }
} // GreaterApp