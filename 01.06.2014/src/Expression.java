
import java.math.BigDecimal;
import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replace(" ", "");
        String [] digit = input.split("[^0-9.]+");
        String [] operand = input.split("[0-9.]+");

        //Pattern digit = Pattern.compile("([+-]*[0-9.0-9]+)+");
//        Matcher match = digit.matcher(input);
//        while (match.find()){
//            System.out.println(match.group());
//        }
        BigDecimal sum = new BigDecimal(digit[0]);
        for (int i =1; i<operand.length;i++) {
            BigDecimal number = new BigDecimal(digit[i]);
            if (operand[i].equals("+")){
                sum = sum.add(number);

            }else if (operand[i].equals("-")){
                sum = sum.subtract(number);
            }else{
                throw new IllegalArgumentException(
                        "Invalid operator: " + operand[i]);
            }

        }
        System.out.println(sum);

    }
}
