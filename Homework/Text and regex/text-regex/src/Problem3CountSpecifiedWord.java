import java.util.Scanner;

public class Problem3CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] text = input.nextLine().toLowerCase().split("\\W+");
        String word = input.nextLine().toLowerCase();
        int counter = 0;

        for (String words : text) {
            if (words.equals(word)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
