import java.util.HashMap;
import java.util.Scanner;

public class pro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] words = input.nextLine().split("\\s");
        String firstWord = words[0];
        String secondWord = words[1];

        System.out.println(areExchangeable(firstWord, secondWord));

    }

    private static boolean areExchangeable(String firstWord, String secondWord) {
        HashMap<Character, Character> lettersMap = new HashMap<>();

        for (int i = 0; i < firstWord.length(); i++) {
            char firstWordLetter = firstWord.charAt(i);
            char secondWordLetter = secondWord.charAt(i);
            if (!lettersMap.containsKey(firstWordLetter)) {
                lettersMap.put(firstWordLetter, secondWordLetter);
            } else if (!lettersMap.get(firstWordLetter).equals(secondWordLetter)) {
                return false;
            }
        }
        return true;
    }
}


