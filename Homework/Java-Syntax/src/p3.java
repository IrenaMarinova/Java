import com.sun.xml.internal.ws.commons.xmlutil.Converter;

import java.util.Scanner;

public class p3 {
    public static String hex (int x){

        String result = (Integer.toString(x, 16)).toUpperCase();
        return result;
    }
    public static String binary (int x){

        String result = Integer.toString(x, 2);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        double c = Double.parseDouble(sc.nextLine());
        String padded1= "|"+ hex(a)+ "          ".substring(hex(a).length());
        String padded2= "|"+ "0000000000".substring(binary(a).length())+ binary(a);
        String padded3= "|         %d";
        System.out.printf(padded1+padded2+"|         %.2f"+"|%.3f       |", b, c);
        //System.out.println(binary(a));
    }
}
//http://stackoverflow.com/questions/4469717/left-padding-a-string-with-zeros
//http://www.dotnetperls.com/padding-java