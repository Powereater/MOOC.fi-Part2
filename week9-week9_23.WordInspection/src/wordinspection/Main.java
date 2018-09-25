package wordinspection;

import java.io.File;

public class Main {

    public static void main(String[] args ) throws Exception {
        WordInspection s = new WordInspection( new File("src/wordList.txt") );
        for (String i : s.wordsContainingZ()) {
            System.out.println(i);
        }
            

    }
}
