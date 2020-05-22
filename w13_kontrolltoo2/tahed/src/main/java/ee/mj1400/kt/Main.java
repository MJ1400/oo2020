package ee.mj1400.kt;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int option;
        String word;
        char t2ht;
        String sentence;

        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Sõna | 2 - Lause ");
        option = Integer.parseInt(scanner.nextLine());

        if (option == 1) {
            System.out.println("Sisesta sõna: ");
            word = scanner.nextLine().toLowerCase();
            System.out.println("Sisesta täht, mille esinemise arvu soovid teada: ");
            t2ht = scanner.nextLine().toLowerCase().charAt(0);

            Word wordobj = new Word(word);
            wordobj.charCount(t2ht);

        } else if (option == 2) {
            System.out.println("Sisesta lause: ");
            sentence = scanner.nextLine().toLowerCase();
            System.out.println("--------------------------------");
            Sentence sentenceobj = new Sentence(sentence);
            sentenceobj.wordCount();
            System.out.println(sentenceobj.getWordObjList().toString());
            System.out.println("--------------------------------");
            System.out.println("Lauses oli tähte a: " + sentenceobj.getSentenceCharCount('a'));
            sentenceobj.readWordsFromFile();
            sentenceobj.writeWordsToFile();

        } else {
            System.out.println("Palun sisestage kas 1 või 2!");
        }
        scanner.close();

    }

}