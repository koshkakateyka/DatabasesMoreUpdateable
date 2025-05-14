import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "example.txt";
        String text = "text";

        // выглядит идеально здесь, даже название
        CreateTheFile createTheFile = new CreateTheFile(text, fileName);
        createTheFile.saveTheFile();

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