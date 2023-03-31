package exercises_ch1;
import java.util.Scanner;
public class strings {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of " +
                "sitting by her sister on the bank, and of having nothing " +
                "to do: once or twice she had peeped into the book her " +
                "sister was reading, but it had no pictures or conversations " +
                "in it, 'and what is the use of a book,' thought Alice " +
                " 'without pictures of conversation?' ";
        String lowercaseSentence = sentence.toLowerCase();
        Scanner search = new Scanner(System.in);
        //System.out.println(sentence);
        System.out.println("Enter a search term for the string: ");
        String searchInput = search.next();
        boolean sentenceContains = lowercaseSentence.contains(searchInput);
        System.out.println("The term you searched was found in the string: " + sentenceContains);
        Integer index = lowercaseSentence.indexOf(searchInput);
        Integer searchLength = searchInput.length();
        System.out.println("The term you searched was in index " + index + " and was " + searchLength + " long");
        String modifiedSentence = sentence.replace(searchInput, "");
        System.out.println(modifiedSentence);

    }
}
