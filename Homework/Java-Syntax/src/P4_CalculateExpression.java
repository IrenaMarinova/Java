import java.util.Scanner;


public class P4_CalculateExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] input = sc.nextLine().split(" ");
        double a = Double.parseDouble(input[0]);
        double b = Double.parseDouble(input[1]);
        double c = Double.parseDouble(input[2]);
        double avgInput = (a+b+c)/3;
        double f1 = Math.pow(((Math.pow(a,2) + Math.pow(b,2))/(Math.pow(a,2) - Math.pow(b,2))), ((a+b+c)/Math.sqrt(c)));
        double f2 = Math.pow((Math.pow(a,2) + Math.pow(b,2) - Math.pow(c,3)), (a-b));
        double avgResult = (f1 + f2)/2;
        double diff = avgInput - avgResult;
        if (diff<0){
            diff =(-1)*diff;
        }
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", f1, f2, diff);
    }
}
//((a2 + b2) / (a2 – b2))(a + b + c) / √c             (a2 + b2 - c3)(a – b)