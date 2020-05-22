package ee.mj1400.kt;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;

class Sentence {
    Scanner scanner = new Scanner(System.in);
    String sentence;
    List<String> sentenceArray;
    int wordcount;
    List<Word> wordObjList = new ArrayList<Word>();
    List<String> fileWordList;
    List<String> newWords = new ArrayList<String>();

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public int wordCount() {
        sentenceArray = Arrays.asList(sentence.split("\\s+"));
        for (String w : sentenceArray) {
            wordcount++;
        }
        System.out.println("Lauses oli " + Integer.toString(wordcount) + " sõna");
        return wordcount;
    }

    public List<Word> getWordObjList() {
        for (String w : sentenceArray) {
            wordObjList.add(new Word(w));
        }

        return wordObjList;
    }

    public int getSentenceCharCount(Character c) {
        int count = 0;
        for (Word obj : wordObjList) {
            count += obj.charCount(c);
            // HashMap<Character, Integer> mapVar = obj.charCount(c);

            // if(mapVar.containsKey(c)){
            // count++;
            // }
        }
        return count;
    }

    public void writeWordsToFile() throws IOException {
        String newLine = System.getProperty("line.separator");
        try (FileWriter writer = new FileWriter("output.txt", true); BufferedWriter bw = new BufferedWriter(writer)) {
            for (String w : newWords) {
                bw.write(w + newLine);
            }

        }

    }

    public void readWordsFromFile() throws IOException {
        List<String> fileWordList = Files.readAllLines(new File("output.txt").toPath(), Charset.defaultCharset());

        for (String w : sentenceArray) {
            if (!fileWordList.contains(w)) {
                newWords.add(w);
            }
        }

        if (newWords.isEmpty()) {
            System.out.println("Uusi sõnu ei olnud!");
        } else {
            System.out.println("Uued sõnad olid: " + newWords.toString());
        }
        System.out.println("Varasemalt olid sõnad: " + fileWordList.toString());
        System.out.println("--------------------------------");

    }

}