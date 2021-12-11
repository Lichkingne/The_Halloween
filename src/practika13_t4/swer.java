package practika13_t4;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
public class swer {
    public static void main(String[] args) throws IOException {

        String pathDir = "d:\\1";
        String pathFile = "d:\\1\\5.txt";

        findFiles ff = new findFiles(pathDir);
        ff.WriteToFileList(pathFile);
        ff.ReadFile(pathFile, 5);
    }
}
