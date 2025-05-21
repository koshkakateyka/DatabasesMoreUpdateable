import java.util.ArrayList;

public class AdvancedLine {
    private String str;
    private ArrayList<String> arrayList1;

    public AdvancedLine(String str){
        this.str = str;
    }

    public int sizeOf(){
        // counting an every single word
        // actually, needs only for counting
        String[] splitStr = str.trim().split("\\s+");

        return splitStr.length;
    }

    public String byIndex(int index){
        // trim + split = delete no needed spaces
        // and divide our whole sentence to the every single word
        String[] splitStr = str.trim().split("\\s+");

        return splitStr[index];
    }

    // unrelized 1
//    public ArrayList<String> getArrayList1() {
//        return arrayList1;
//    }
//
//    // counting tokens after command open
//    public void countingAfterFirst(){
//        int index;
//
//        String[] splitStr = str.trim().split("\\s+");
//
//        for (int i = 1; i < splitStr.length; i++)
//            return splitStr[index];
//    }



}
