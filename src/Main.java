import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        // write the full sentence, for out command line
        Scanner scanner = new Scanner(System.in);

        functione(scanner.nextLine());
    }

    // https://stackoverflow.com/questions/7899525/how-to-split-a-string-by-space
    public static void functione(String str){
        // counting an every single word
        // actually, needs only for counting
        StringTokenizer tokens = new StringTokenizer(str, " ");

        // trim + split = delete no needed spaces
        // and divide our whole sentence to the every single word
        String[] splitStr = str.trim().split("\\s+");

        // now, we have a good and checked words for put our words - to the command line
        for(int i = 0; i < tokens.countTokens(); i++)
            System.out.println(splitStr[i]);
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