import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

class Kodune {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> hinded = new ArrayList<String>();
        int min = 1;
        int max = 6;
        Random rg = new Random();

        for(int i = 0; i < 50; i++){
            int randint = rg.nextInt(max-min) + 1;
            String randintS = String.valueOf(randint);
            hinded.add(randintS);
    }

    List<Integer> hindedInt = hinded.stream().map(Integer::valueOf).filter(i -> i > 0).sorted().collect(Collectors.toList());
    //long arrSize = hindedInt.stream().count();

    PrintWriter pw = new PrintWriter(new FileOutputStream("output.txt"));
    for (Integer numbers : hindedInt)
        pw.println(numbers);
    pw.close();
}
}