import java.util.Scanner;

public class SumCards {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String [] input = scn.nextLine().split(" ");
        char [] cards = new char [input.length];
        int [] hand = new int [input.length];
        int previous = 0;
        int counter =0;
        int sum =0;
        for (int i =0;i<cards.length; i++) {
            cards[i] = input[i].charAt(0);
            if (cards[i]=='2'){
                hand[i]=2;
            }else if (cards[i]=='3'){
                hand[i]=3;
            }else if (cards[i]=='4'){
                hand[i]=4;
            }else if (cards[i]=='5'){
                hand[i]=5;
            }else if (cards[i]=='6'){
                hand[i]=6;
            }else if (cards[i]=='7'){
                hand[i]=7;
            }else if (cards[i]=='8'){
                hand[i]=8;
            }else if (cards[i]=='9'){
                hand[i]=9;
            }else if (cards[i]=='1'){
                hand[i]=10;
            }else if (cards[i]=='J'){
                hand[i]=12;
            }else if (cards[i]=='Q'){
                hand[i]=13;
            }else if (cards[i]=='K'){
                hand[i]=14;
            }else if (cards[i]=='A'){
                hand[i]=15;
            }else{
                continue;
            }

            //System.out.println(hand[i]);
        }
        for (int c : hand) {

            if (c ==previous){

                counter++;
            }else{
                counter=1;
            }
            sum=sum+c;
            if(counter==2){
                sum = sum+c*2;
            }
            if(counter>2) {
                sum = sum + c;
            }
            previous=c;
        }
//        if (hand[input.length-1]==hand[input.length-2]/2){
//            hand[input.length-1]=hand[input.length-1]*2;
//        }
//        for (int i = 0; i <input.length ; i++) {
//            System.out.println(hand[i]);
//        }
        System.out.println(sum);
    }
}
