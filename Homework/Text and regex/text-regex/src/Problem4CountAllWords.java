import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem4CountAllWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] text = input.nextLine().split("\\W+");
        System.out.println(text.length);
    }
}

