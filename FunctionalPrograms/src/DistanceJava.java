import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class DistanceJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter two number : ");
        double x = sc.nextInt();
        double y = sc.nextInt();

      //double distance=  Math.sqrt(Math.pow(x,2+Math.pow(x,2)));
      double distance = sqrt(x*x + y*y);
        System.out.println(distance);

    }
}
