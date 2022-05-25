package logical;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args){

        System.out.println("please type the number ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reverse = 0;

        while(number != 0) {

            int  remainder = number % 10;
            reverse = reverse*10 + remainder;
            number = number/10;

        }

        System.out.println("the given number is " + reverse);
    }


}
