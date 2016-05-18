import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem1FilterArray {
    private static boolean isLonger (String str){
        int counter = 0;
        for (char ch : str.toCharArray()) {
            counter++;
        }
        if (counter<=3){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] splited = input.nextLine().split(" ");
        List<String> output = Arrays.stream(splited).filter(Problem1FilterArray::isLonger).collect(Collectors.toList());
        for (int i = 0; i < output.size(); i++) {
            String result = output.get(i);
            System.out.print(result+" ");
        }


    }
}