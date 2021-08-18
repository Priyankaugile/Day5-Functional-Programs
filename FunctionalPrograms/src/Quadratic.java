import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers : ");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();

        double delta = b*b - 4*a*c;
        System.out.println(delta);
        double Root_1  = (-b + Math.sqrt(delta))/(2*a);
        double Root_2  = (-b - Math.sqrt(delta))/(2*a);
        System.out.println( "root1: " +Root_1+" root2: "+Root_2);
    }
}
