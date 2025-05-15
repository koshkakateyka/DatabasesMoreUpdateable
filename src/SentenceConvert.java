import java.util.StringTokenizer;

public class SentenceConvert {
    private int index = 0;
    private String str;

    SentenceConvert(String str){
        this.str = str;
    }

    // https://stackoverflow.com/questions/7899525/how-to-split-a-string-by-space
    public int lenght(){
        // counting an every single word
        // actually, needs only for counting
        StringTokenizer tokens = new StringTokenizer(str, " ");

        return tokens.countTokens();
    }

    // https://stackoverflow.com/questions/7899525/how-to-split-a-string-by-space
    public String trimPlusSplit(){
        // trim + split = delete no needed spaces
        // and divide our whole sentence to the every single word
        String[] splitStr = str.trim().split("\\s+");

        return splitStr[index];
    }
}
