package Com.Harman;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        int number1, number2, number3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        number1=sc.nextInt();
        System.out.println("Enter the 2nd number:");
        number2=sc.nextInt();
        number3 = number1 + number2;
        System.out.println("Addition of two numbers:"+number3);

    }

}
