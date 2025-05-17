import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // for concatinate
        // fo example:
        // input = open "C:\Temp\another
        // but we lost file.xml"
        // so, here is why i use ArrayList
        // https://www.programiz.com/java-programming/arraylist
        ArrayList<String> arrayList = new ArrayList<>();

        // main loop of cmd work
        while (true) {
            String line = scanner.nextLine();
            AdvancedLine aLine = new AdvancedLine(line);

            if(aLine.index(0).equals("open"))
                for(int i = 1; i < aLine.countOfWords(); i++)
                    arrayList.add(aLine.index(i));


            for(int i = 0; i < arrayList.size(); i++)
                System.out.println(arrayList.get(i));

            // https://docs.vultr.com/java/standard-library/java/lang/String/join
            String result = String.join(" ", arrayList);
            System.out.println(result);
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