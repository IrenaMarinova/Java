import com.sun.org.apache.xpath.internal.SourceTree;
import java.util.*;
import java.util.stream.Collectors;
import static java.lang.Integer.reverse;

public class Problem2SortArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] splited = input.nextLine().split(" ");
        String order = input.nextLine();
        List<Integer> numbers = Arrays.stream(splited).map(Integer::parseInt).collect(Collectors.toList());
        if (order.equals("Ascending")) {
            numbers.stream().sorted((e1, e2) -> Integer.compare(e1.intValue(),
                    e2.intValue()))
                    .forEach(e -> System.out.print(e + " "));
        }else if (order.equals("Descending")) {

            numbers.stream().sorted((e1, e2) -> Integer.compare(e2.intValue(),
                    e1.intValue()))
                    .forEach(e -> System.out.print(e + " "));
        }else{
            System.out.println("Wrong input!");
        }
    }
}
