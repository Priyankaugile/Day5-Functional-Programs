import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
       System.out.println("enter number of Row and Column");
        Scanner sc = new Scanner(System.in);
        int Row = sc.nextInt();
        int Column = sc.nextInt();
        int  [][] table  = new int[Row][Column];
        System.out.println("enter elements of an array");
       // int element = (int) Math.floor(Math.random()*10)%100;
        for (int i = 0; i<Row; i++){
            for (int j = 0; j < Column; j++){
               table [i][j] = sc.nextInt();
                System.out.print(table [i][j]+ " ");

            }
            System.out.println( " ");
        }
    }
}
