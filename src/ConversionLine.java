import java.util.StringTokenizer;

public class ConversionLine {
    private String str;

    ConversionLine(String str){
        this.str = str;
    }

    // https://stackoverflow.com/questions/7899525/how-to-split-a-string-by-space
    public int countOfWords(){
        // counting an every single word
        // actually, needs only for counting
        StringTokenizer tokens = new StringTokenizer(str, " ");

        return tokens.countTokens();
    }

    // https://stackoverflow.com/questions/7899525/how-to-split-a-string-by-space
    public String trimPlusSplit(int index){
        // trim + split = delete no needed spaces
        // and divide our whole sentence to the every single word
        String[] splitStr = str.trim().split("\\s+");

        return splitStr[index];
    }



}
