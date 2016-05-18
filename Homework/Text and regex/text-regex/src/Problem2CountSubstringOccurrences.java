import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//
//public class Problem2CountSubstringOccurrences {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String [] text = input.nextLine().toLowerCase().split(" ");
//        String substring = input.nextLine().toLowerCase();
//        int counter = 0;
//
//        for (String words : text) {
//            if (words.contains(substring)){
//                counter++;
//            }
//        }
//        System.out.println(counter);
//    }
//}
public class Problem2CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String searchText = scanner.nextLine().toLowerCase();
        String regex = scanner.nextLine().toLowerCase();
        Pattern pattern = Pattern.compile("(?<=" + regex.substring(0,1) + ")" + regex.substring(1));
        Matcher matcher = pattern.matcher(searchText);

        int counter = 0;
        while (matcher.find()){
            counter++;
        }

        System.out.println(counter);
        System.out.println(regex.substring(1));
    }
}