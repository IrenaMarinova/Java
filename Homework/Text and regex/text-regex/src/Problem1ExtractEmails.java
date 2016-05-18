import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Problem1ExtractEmails {
    public static void main(String[] args) {
        String regex = "([a-z.-_\\d]+)@([a-z]+).([a-z]+)(\\.[a-z-]+)+";
        Scanner input = new Scanner(System.in);
        String potentialEmails = input.nextLine();
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(potentialEmails);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
