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


        // main loop of cmd work
        while (true) {
            String line = scanner.nextLine();
            ConversionLine conversionLine = new ConversionLine(line);

            // here i use it: for(i)for(j)if(firstWord[0] == secondWord[j]), combinational check
            for (int i = 0; i < conversionLine.countOfWords(); i++){
                for (int j = 0; j < sequenceOfCommands.length; j++)

                    // THE BUG IS HERE, DOUBLE WORK, IF YOU WRITE JUST:
                    // open open
                    // the result:
                    // true
                    // true
                    //
                    // but should be only once:
                    // true
                    //

                    // потому-что у тебя слова раздельно работают, вот и проблема, было бы вместе, был бы другой
                    // разговор

                    // тоже мне ещё проблема, которую надо будет как нибудь решить, с проверкой фулл предложения
                    // на начальное слово, вот это вот сложно уже реализовать
                    // потому-что выглядит уже как рефакторинг всего этого кода, увы
                    if(conversionLine.trimPlusSplit(0).equals(sequenceOfCommands[j])){
                        System.out.println("true");
                    }


            }

        }

    }



}




























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