import java.util.Scanner;

public class Problem05CountAllWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] substrings = input.nextLine().split(" ");
        System.out.println(substrings.length);
    }
}
