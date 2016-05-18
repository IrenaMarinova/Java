import java.util.Scanner;
//import java.lang.String;
//import java.math.MathContext;

public class TriangleArea {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String pointAx = input.next();
        String pointAy = input.next();
        int ax = Integer.parseInt(pointAx);
        int ay = Integer.parseInt(pointAy);

        String pointBx = input.next();
        String pointBy = input.next();
        int bx = Integer.parseInt(pointBx);
        int by = Integer.parseInt(pointBy);

        String pointCx = input.next();
        String pointCy = input.next();
        int cx = Integer.parseInt(pointCx);
        int cy = Integer.parseInt(pointCy);

        double area = (double)(ax*(by-cy)+bx*(cy-ay)+cx*(ay-by))/2;
        if (area>=0) {
            System.out.print((int) area);
        }
        else {
            System.out.print((int) area*(-1));
        }

    }

}
