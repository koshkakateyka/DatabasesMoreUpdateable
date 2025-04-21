import java.io.File;
public class ListFiles {
    private String dirPath;

    public ListFiles(String dirPath) {
        this.dirPath = dirPath;
    }

    public void listFile(String dirPath) {
        File directory = new File(dirPath);
        File[] files = directory.listFiles();
        if (files != null)
            for (File file : files)
                System.out.println(file.getName());
    }
}

