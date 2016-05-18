import java.util.Scanner;

public class Monopoly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] rowCol = sc.nextLine().split(" ");
        int row = Integer.parseInt(rowCol[0]);
        int col = Integer.parseInt(rowCol[1]);
        int hotels = 0;
        int money = 50;
        int turns = row*col;
        int counter = 0;
        for (int i=0; i<row;i++) {
            String input=sc.nextLine();
            if(i%2!=0){
                for (int j = col-1; j >=0 ; j--) {
                    if (input.charAt(j)=='H'){
                        hotels = hotels + 1;
                        System.out.printf("Bought a hotel for %1$d. Total hotels: %2$d.\n", money, hotels);
                        money=hotels*10;
                        counter++;
                    }else if (input.charAt(j)=='J'){
                        System.out.printf("Gone to jail at turn %d.\n", counter);
                        counter = counter+3;
                        money = money + hotels*10*3;

                    }else if (input.charAt(j)=='S'){
                        int price = (i+1)*(j+1);
                        counter++;
                        if (price<=money){
                            System.out.printf("Spent %d money at the shop.\n", price);
                            money= money- price;
                        }else{
                            System.out.printf("Spent %d money at the shop.\n", money);
                            money=0;
                        }

                        money = money + hotels*10;


                    }else{
                        counter++;
                        money = money + hotels*10;
                    }
                }
            }else {
                for (int k = 0; k < col; k++) {
                    if (input.charAt(k)=='H'){
                        hotels = hotels + 1;
                        System.out.printf("Bought a hotel for %1$d. Total hotels: %2$d.\n", money, hotels);
                        money=hotels*10;
                        counter++;
                    }else if (input.charAt(k)=='J'){
                        System.out.printf("Gone to jail at turn %d.\n", counter);
                        counter = counter+3;
                        money = money + hotels*10*3;
                    }else if (input.charAt(k)=='S'){
                        int price = (i+1)*(k+1);
                        counter++;
                        if (price<=money){
                            System.out.printf("Spent %d money at the shop.\n", price);
                            money= money- price+ hotels*10;
                        }else{
                            System.out.printf("Spent %d money at the shop.\n", money);
                            money = 0 + hotels*10;
                        }

                    }else{
                        counter++;
                        money = money + hotels*10;
                    }
                }

            }
        }
        System.out.println("Turns "+counter);
        System.out.println("Money "+money);
    }
}

