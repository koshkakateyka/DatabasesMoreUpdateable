import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // for "cin >>"

        // array of commands, it is very needed, for check... like combinational check
        // firstWord[0] == "open";
        // firstWord[1] == "open";
        // ...
        // firstWord[5] == "open";
        // if it is true, we pass it
        /// use it on the: for(i)for(j)if(firstWord[0] == "open")
        // bad explained, just: for(i)for(j)if(firstWord[0] == secondWord[j])
        String[] sequenceOfCommands = {"open", "close", "save", "saveas", "help", "exit"};
        boolean switcher = false;
        int j = 0;

        // main loop of cmd work
        while (true) {
            String line = scanner.nextLine();
            ConversionLine conversionLine = new ConversionLine(line);

            // here i use it: for(i)for(j)if(firstWord[0] == secondWord[j]), combinational check
            do{
                if(conversionLine.trimPlusSplit(0).equals(sequenceOfCommands[j])){
                    System.out.println("true");
                    switcher = true;
                }
                j++;
            }while(switcher == false || j < sequenceOfCommands.length);
            j = 0;
        }


    }



}



























//                        do{
//                            if(conversionLine.trimPlusSplit(0).equals(sequenceOfCommands[j])){
//                                System.out.println("true");
//                                switcher = true;
//                            }
//                        }while(switcher != true || i < conversionLine.countOfWords() && j < sequenceOfCommands.length);
//    public static String idk(){
//        StringTokenizer tokens = new StringTokenizer("Hello I'm your String", " ");
//        String[] splited = new String[tokens.countTokens()];
//        int index = 0;
//        while(tokens.hasMoreTokens()){
//            splited[index] = tokens.nextToken();
//            ++index;
//        }
//
//        for(int i = 0; i < index; i++)
//            return splited[i];
//    }