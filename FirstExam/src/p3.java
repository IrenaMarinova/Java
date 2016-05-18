import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.math.*;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int counter = 0;
        int criticalRatio = 0;
        BigInteger point = BigInteger.valueOf(-1);
        String result ="";
        int breakPoint =0;
        ArrayList<Integer> nums = new ArrayList<>();
        HashMap<Integer, ArrayList<String>> lines = new HashMap<>();
        while (input!="Break it."){
                String[] line = input.split(" ");
                if (line.length==4) {
                    lines.put(counter, new ArrayList<>(Arrays.asList(line[0], line[1], line[2], line[3])));
                    counter++;
                    criticalRatio = (Integer.parseInt(line[0]) + Integer.parseInt(line[1]) - (Integer.parseInt(line[2]) + Integer.parseInt(line[3])));
                    if (criticalRatio < 0) {
                        criticalRatio = criticalRatio * (-1);
                    }
                    nums.add(criticalRatio);
                    int match =0;
                    if(counter>=1){
                        match = nums.get(counter-1);
                        for (int i = 0; i < counter; i++) {
                            if ((i!=counter-1)&&((nums.get(i) == 0)||(match==nums.get(i)))) {
                                if (match!=0) {
                                    breakPoint = match;
                                    point =(BigInteger.valueOf(breakPoint).pow(counter));
                                    result = point.remainder(BigInteger.valueOf(counter)).toString();
                                }


                            }
                            //System.out.println(point);
                        }

                    }
                }else{

                    break;
                }
            input = sc.nextLine();
        }
        if (point.intValue()==-1){
            System.out.println("Critical breakpoint does not exist.");
        }else {
            for (Integer integer : lines.keySet()) {
                System.out.println("Line: "+ lines.get(integer));
            }

            System.out.println("Critical Breakpoint: " + result);
            //System.out.println((long)Math.pow(3, 0)%0);
            BigInteger big = BigInteger.valueOf(177832).pow(12);
            System.out.println(big.longValue()%12);
        }
    }
}
