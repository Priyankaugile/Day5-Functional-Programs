import java.util.Scanner;

public class WindChill {
    /*public static void main(String[] args) {

        System.out.println("Enter the value of Temprature in Farenheit: ");
        Scanner sc  =  new Scanner(System.in);
        double t = sc.nextDouble();
        System.out.println("Enter the value of wind speed in miles per Hour: ");
        double v = sc .nextDouble();
        if (t<=50 && v<3 && v>120){
            double W= 35.74+0.6215 * t+(0.4275 * t -35.75) * Math.pow(v,0.16);
            System.out.println("Wind Chill " +W);

        }
        else{
            System.out.println("The value of t should not be greter that 50, greater than 120 and less that 3.");
        }
    }*/

    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        System.out.println("Enter the value of Temprature in Farenheit: ");
        double t = sc.nextDouble();
        System.out.println("Enter the value of wind speed in miles per Hour: ");
        double v = sc.nextDouble();
        if (t<=50 && v<3 && v>120){
            double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
            System.out.println("Wind chill  = " + w);
        }
        else {
            System.out.println("your value is not in range.");
        }
        System.out.println("Temperature = " + t);
        System.out.println("Wind speed  = " + v);
    }
}
