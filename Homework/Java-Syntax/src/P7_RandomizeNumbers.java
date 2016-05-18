import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class P7_RandomizeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());
        //Random rn = new Random();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        if (n>m){

            for (int i = m; i <= n; i++) {
                numbers.add(i);
            }
            Collections.shuffle(numbers);
            for (int i = 0; i <=n-m ; i++) {
                System.out.print(numbers.get(i)+" ");
            }


        }else if (m>n){

            for (int i = n; i <= m; i++) {
                numbers.add(i);
            }
            Collections.shuffle(numbers);
            for (int i = 0; i <=m-n ; i++) {
                System.out.print(numbers.get(i)+" ");
            }

        }else {
            System.out.println(n);
        }

    }
}
