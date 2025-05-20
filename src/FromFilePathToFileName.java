public class FromFilePathToFileName {
    private String filePath;

    public FromFilePathToFileName(String filePath){
        this.filePath = filePath;
    }

    public void convert(){
        // https://stackoverflow.com/questions/22461703/character-iswhitespace-explanation
        // https://docs.oracle.com/en/cloud/saas/marketing/responsys-develop/RPL/RegularExpressions.htm
        // https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#sum
        String[] splitStr = filePath.split("[\\p{Punct}]");

        for (int i = 0; i < splitStr.length; i++){
            System.out.println(splitStr[i]);
        }

    }

}
