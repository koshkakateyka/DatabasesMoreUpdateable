import java.util.ArrayList;

public class MyCmd {
    // beside Scanner, the same things are here
    private KeyboardReader keyboardReader = new KeyboardReader();
    private AdvancedLine aLine;
    private String filePath;
    private static boolean oopen;

    MyCmd(AdvancedLine aLine){
        this.aLine = aLine;
    }

    // open logic
    public void open(){
        if(aLine.index(0).equals("open")){
            oopen = true;


            // for concatinate
            // fo example:
            // input = open "C:\Temp\another
            // but we lost file.xml"
            // so, here is why i use ArrayList
            // https://www.programiz.com/java-programming/arraylist
            ArrayList<String> arrayList = new ArrayList<>();

            for (int i = 1; i < aLine.countOfWords(); i++)
                arrayList.add(aLine.index(i));

            // https://docs.vultr.com/java/standard-library/java/lang/String/join
            // never use one quote like that: open 'filePath'
            filePath = String.join(" ", arrayList).replaceAll("\"", "");

            // https://programmingfundamental.github.io/courses/docs/object-oriented-programming-1-part/laboratory-exercise-10
            OpenFile openFile = new OpenFile(filePath);
            openFile.output();
        }
    }

    // close logic
    public void close(){
        if(aLine.index(0).equals("close") && oopen == true)
        // save the data and close(like, you can't use again opened file, because you are close the file)
        // some logic here about close,
            System.out.println("Successfully closed " + filePath);
        else if (aLine.index(0).equals("close") && oopen == false)
            System.out.println("You can't close any file, because you never open anything, use it first:" + "\n" +
                        "open <file>" + "\n" +
                        "then: " + "\n" +
                        "close" + "\n");
    }

    // save logic
    public void save(){
        if (aLine.index(0).equals("save")) {

        }
    }

    // saveas logic
    public void saveas(){
        if (aLine.index(0).equals("saveas")) {
            // for concatinate
            // fo example:
            // input = open "C:\Temp\another
            // but we lost file.xml"
            // so, here is why i use ArrayList
            // https://www.programiz.com/java-programming/arraylist
            ArrayList<String> arrayList = new ArrayList<>();

            for(int i = 1; i < aLine.countOfWords(); i++)
                arrayList.add(aLine.index(i));

            // https://docs.vultr.com/java/standard-library/java/lang/String/join
            // never use one quote like that: open 'filePath'
            filePath = String.join(" ", arrayList).replaceAll("\"","");

            System.out.println(filePath);

            // https://programmingfundamental.github.io/courses/docs/object-oriented-programming-1-part/laboratory-exercise-10
            OpenFile openFile = new OpenFile(filePath);
            /*String data =*/ openFile.output();
//                System.out.println(data);
        }
    }

    // help logic
    public void help(){
        if (aLine.index(0).equals("help"))
            System.out.println("The following commands are supported:\n" +
                    "open <file> opens <file>\n" +
                    "close closes currently opened file\n" +
                    "save saves the currently open file\n" +
                    "saveas <file> saves the currently open file in <file>\n" +
                    "help prints this information\n" +
                    "exit exists the program");
    }

    // exit logic
    public void exit(){
        if (aLine.index(0).equals("exit")) {
            System.out.println("Exiting the program...");
            System.exit(0);
        }
    }


}
