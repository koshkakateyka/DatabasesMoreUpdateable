import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write the full sentence, for out command line
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // for command line
            String myFullSentence = scanner.nextLine();

            SentenceConvert sentenceConvert = new SentenceConvert(myFullSentence, 0);

            for (int i = 0; i < sentenceConvert.lenght(); i++)
                System.out.println(sentenceConvert.trimPlusSplit(i));
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