public class AdvancedLine {
    private String str;

    AdvancedLine(String str){
        this.str = str;
    }

    // https://stackoverflow.com/questions/7899525/how-to-split-a-string-by-space
    public int countOfWords(){
        // counting an every single word
        // actually, needs only for counting
        String[] splitStr = str.trim().split("\\s+");

        return splitStr.length;
    }

    // https://stackoverflow.com/questions/7899525/how-to-split-a-string-by-space
    public String index(int iindex){
        // trim + split = delete no needed spaces
        // and divide our whole sentence to the every single word
        String[] splitStr = str.trim().split("\\s+");

        return splitStr[iindex];
    }



}
