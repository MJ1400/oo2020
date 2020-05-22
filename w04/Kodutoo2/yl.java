import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class yl {
    public static void main(String[] args) throws IOException {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        int length = 0;

        FileReader fr = new FileReader(file1);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        while (line != null) {
            length = line.length();
            System.out.println(line);
            line = br.readLine();

        }
    }
}