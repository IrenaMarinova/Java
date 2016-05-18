import java.util.Scanner;

public class StuckNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = Integer.parseInt(input.nextLine());
        String [] numbers = input.nextLine().split(" ");
        int exe = 0;
        for (int i = 0; i < count ; i++) {
            for (int j = 0; j <count ; j++) {
                for (int k = 0; k <count ; k++) {
                    for (int l = 0; l <count ; l++) {
                        if(numbers[i]!=numbers[j]&&numbers[i]!=numbers[k]&&numbers[i]!=numbers[l]&&numbers[j]!=numbers[k]&&numbers[j]!=numbers[l]&&numbers[k]!=numbers[l]) {
                            String first = numbers[i] + numbers[j];
                            String second = numbers[k] + numbers[l];

                            if (first.equals(second)) {
                                System.out.println(numbers[i] + "|" + numbers[j] + "==" + numbers[k] + "|" + numbers[l]);
                                exe++;
                            }
                        }
                    }

                }
            }
        }
        if (exe == 0) {
            System.out.println("No");
        }
    }
}
