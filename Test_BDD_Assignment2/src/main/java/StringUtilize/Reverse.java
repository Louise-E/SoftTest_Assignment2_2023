package StringUtilize;

import com.sun.tools.javac.Main;

public class Reverse {
    public static String Backwards(String phrase) {
        phrase = "Hello";

        char[] phraseArray = phrase.toCharArray();

        for(int i = phraseArray.length - 1; i >= 0; i--) {
            System.out.print(phraseArray[i]);
        }
        return phrase;
    }
}
