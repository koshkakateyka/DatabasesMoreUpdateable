public class FromFilePathToFileName {
//    private String filePath;
//    private KeyboardWriter keyboardWriter;

//    public FromFilePathToFileName(String filePath){
//        this.filePath = filePath;
//    }

    public String convert(String filePath){
        // https://stackoverflow.com/questions/22461703/character-iswhitespace-explanation
        // https://docs.oracle.com/en/cloud/saas/marketing/responsys-develop/RPL/RegularExpressions.htm
        // https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#sum

        // let's explain
        // "\\\\" = find this "\"
        // when we find it, at the end of index = fileName
        // that's all
        String[] splitStr = filePath.split("\\\\");

        return splitStr[splitStr.length-1];
    }

}
