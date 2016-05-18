import java.util.Scanner;

public class P6_7toDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int x = Integer.parseInt(sc.nextLine());
        String x = sc.nextLine();
        String result = Integer.toString(Integer.parseInt(x,7),10);
        System.out.println(result);
    }
}
