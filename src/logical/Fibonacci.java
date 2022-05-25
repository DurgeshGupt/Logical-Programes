package logical;

public class Fibonacci {

    public static void main(String[] args){
        int f1 = 0, f2 = 1, fn, i, count = 10;
        System.out.println(f1+" "+f2);

        for(i=0; i<count; i++){

            int f3 = f1 + f2;
            System.out.println("the fibbonacci number is" + f3);

            f1 = f2;
            f2 = f3;


        }

    }

}
