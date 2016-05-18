import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.*;
import java.util.HashMap;

public class Problem02SequencesOfEqualStrings {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String [] substrings = input.nextLine().split(" ");
        HashMap<Integer, ArrayList<String>> output = new HashMap<>();
        output.put(0, new ArrayList<>(Arrays.asList(substrings[0])));

        for (int i = 0; i <substrings.length ; i++) {
            for (String str : substrings) {

                if (str.equals(substrings[i])) {

                    output.get(i).add(str);

                } else {
                    output.put(i, new ArrayList<>(Arrays.asList(substrings[i])));
                }

            }
            output.put(i+1, new ArrayList<>(Arrays.asList(substrings[i])));
        }

        for (int key : output.keySet()) {
            System.out.println(output.get(key));
        }

    }
}
    Във втората задача нещо много си усложнил/а нещата. Нямаш нужда от мапове тук. Не ти изкарва верни резултати. Тъй като не знам как да ти го обясня, ще ти копирам моето решение:
public class SequanceEqualStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entireLine = sc.nextLine();
        String[] line = entireLine.split(" ");

        String x;
        String y;
        System.out.print(line[0] + " ");
        for (int i = 1; i < line.length; i++) {
            x = line[i];
            y = line[i - 1];
            if (x.equals(y)) {
                System.out.print(x + " ");
            } else {
                System.out.println();
                System.out.print(x + " ");
            }

        }
    }
}
 //   На петата задача стринга ти се разделя само от интервалите и затова не ти брои думите както трябва. Сложи му в скобите на сплита ("\P{Alpha}+"), //което явно за разделител приема всеки знак, различен от буква.


//    Във втората задача нещо много си усложнил/а нещата. Нямаш нужда от мапове тук. Не ти изкарва верни резултати. Тъй като не знам как да ти го обясня, //ще ти копирам моето решение:
//public class SequanceEqualStrings {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String entireLine = sc.nextLine();
//        String[] line = entireLine.split(" ");
//
//        String x;
//        String y;
//        System.out.print(line[0] + " ");
//        for (int i = 1; i < line.length; i++) {
//            x = line[i];
//            y = line[i - 1];
//            if (x.equals(y)) {
//                System.out.print(x + " ");
//            } else {
//                System.out.println();
//                System.out.print(x + " ");
//            }
//
//        }
//    }
//}

