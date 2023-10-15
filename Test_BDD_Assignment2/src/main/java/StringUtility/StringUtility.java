package StringUtility;

public class StringUtility {
    public String reverse(String phrase) {

       return new StringBuilder(phrase).reverse().toString();
    }

    public String capitalize(String phrase) {
        return phrase.toUpperCase();
    }

    public String lowercase(String phrase) {
        return phrase.toLowerCase();
    }
}
