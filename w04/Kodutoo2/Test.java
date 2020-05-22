import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        File fileW = new File("test2.txt");
        /*
         * System.out.println(file.getName() + "\n" + file.isFile() + "\n" +
         * file.isDirectory() + "\n" + file.isHidden() + "\n" + file.lastModified());
         */

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        BufferedReader b2 = new BufferedReader(new FileReader(new File("test.txt")));

        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
            line = br.readLine();

        }

        br.close();
        fr.close();

        if (!fileW.exists()) {
            fileW.createNewFile();
        }

        PrintWriter pw = new PrintWriter(fileW);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            pw.println(scanner.nextLine());
            // pw.println(scanner.nextLine().length());
        }
        scanner.close();
        pw.close();
    }
}