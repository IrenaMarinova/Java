import java.util.Scanner;

public class BasicMarkupLanguage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int counter = 1;
        while (!input.equals("<stop/>")){
            String [] line = input.split("\"");
            if ((line[0].contains("inverse"))&(line[1].length()>=1)){
                String inversed = "";
                for (int i = 0; i <line[1].length() ; i++) {
                    if (Character.isUpperCase(line[1].charAt(i))){
                        inversed = inversed+Character.toLowerCase(line[1].charAt(i));
                    }else{
                        inversed = inversed+Character.toUpperCase(line[1].charAt(i));
                    }
                }
                System.out.printf("%d. %s\n", counter, inversed);
                counter++;
            }else if ((line[0].contains("reverse"))&(line[1].length()>=1)){
                String reversed = "";
                for (int i = (line[1].length())-1 ; i>=0; i--) {
                    reversed = reversed + line[1].charAt(i);
                }
                System.out.printf("%d. %s\n", counter, reversed);
                counter++;
            }else if ((line[0].contains("value"))&(line[1].length()>=1)){
                int value = Integer.parseInt(line[1]);
                for (int i = 0; i <value ; i++) {
                    System.out.printf("%d. %s\n", counter, line[3]);
                    counter++;
                }
            }
            input = sc.nextLine();
        }
    }
}
