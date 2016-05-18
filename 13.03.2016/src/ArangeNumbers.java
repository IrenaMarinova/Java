import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArangeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] input = sc.nextLine().split("\\, ");
        //ArrayList<Character> unsorted = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            if (input[i].contains("1")|input[i].contains("2")|input[i].contains("3")|input[i].contains("4")|input[i].contains("5")|input[i].contains("6")|input[i].contains("7")|input[i].contains("8")|input[i].contains("9")|input[i].contains("0")) {
                input[i] = input[i].replaceAll("1", "one").replaceAll("2","two").replaceAll("3", "three").replaceAll("5", "five").replaceAll("4", "four").replaceAll("6", "six").replaceAll("7", "seven").replaceAll("8", "eight").replaceAll("9", "nine").replaceAll("0", "zero");
            }
        }
        Arrays.sort(input);
        for (int i = 0; i <input.length ; i++) {
            input[i] = input[i].replaceAll("one", "1").replaceAll("two", "2").replaceAll("three", "3").replaceAll("five", "5").replaceAll("four","4").replaceAll("six","6").replaceAll("seven", "7").replaceAll("eight","8").replaceAll("nine","9").replaceAll("zero", "0");
        }
        for (int i = 0; i < input.length-1; i++) {
            System.out.print(input[i]+", ");
        }
        System.out.println(input[input.length-1]);
    }
}
