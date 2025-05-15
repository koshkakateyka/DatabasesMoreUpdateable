import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // write the full sentence, for out command line
        Scanner scanner = new Scanner(System.in);

        // main loop of cmd work
        while (true) {

            // for command line
            String line = scanner.nextLine();
            ConversionLine cLine = new ConversionLine(line);

            // class philosophy, looks like perfectionism
            for (int i = 0; i < cLine.lenghtOfWords(); i++){

                // hard interpret it, but okay
                String cmdTokens = cLine.trimPlusSplit(i);
                System.out.println(cmdTokens);
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