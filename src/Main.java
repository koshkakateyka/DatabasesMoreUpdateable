import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "example.txt";
        String text = "text";

        // выглядит идеально здесь, даже название
        CreateTheFile createTheFile = new CreateTheFile(text, fileName);
        createTheFile.saveTheFile();

        FileReader fileReader;
        FileWriter fileWriter;
        int ch;
        try{
            fileReader = new FileReader("example.txt");
            fileWriter = new FileWriter("output.txt");

            while ((ch = fileReader.read()) != 1){
                // ch - variable, only for readOnly
                fileWriter.write(ch);
            }

            fileReader.close();
            fileWriter.close();
            System.out.println("File " + fileName + " closed correctly");
        }catch (IOException e){
            System.err.println("File " + fileName + " isn't closed, the error is: " + e);
            e.printStackTrace();
        }

        BufferedReader bufferedReader;
        PrintWriter printWriter;
        String line;
        try{
            bufferedReader = new BufferedReader(new FileReader(fileName));
            printWriter = new PrintWriter(new FileWriter(fileName));

            while ((line = bufferedReader.readLine()) != null) {
                printWriter.write(line);
            }

            bufferedReader.close();
            printWriter.close();
        }catch (IOException e) {
            e.printStackTrace();
        }


    }
}