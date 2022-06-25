import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args){
        long n, sum  = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number");
        n = num.nextLong();
        int i=1;

        while (i <= n/2){

            if (n % i == 0){

                sum = sum + i;
            }
            i++;
        }
        if (sum == n){
            System.out.println(n+ "Perfect number");
        }
        else
            System.out.println(n+ "Not Perfect number");
    }
}
