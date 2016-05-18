import java.util.Scanner;

public class P5_DecTo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        String result = (Integer.toString(x, 7));
        System.out.println(result);
    }
}
