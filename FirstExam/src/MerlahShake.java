import java.util.Scanner;

public class MerlahShake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String patern = sc.nextLine();
        int firstMatch = input.indexOf(patern);
        int lastMatch = input.lastIndexOf(patern);
        while (firstMatch!=lastMatch&&patern.length()>0){
            System.out.println("Shaked it.");
            input = input.substring(0,firstMatch) +input.substring(firstMatch+patern.length(), lastMatch)+input.substring(lastMatch+patern.length(), input.length());
            patern = patern.substring(0, patern.length()/2)+patern.substring(patern.length()/2+1, patern.length());
            firstMatch = input.indexOf(patern);
            lastMatch = input.lastIndexOf(patern);
        }
        System.out.println("No shake.");
        System.out.println(input);
    }
}
