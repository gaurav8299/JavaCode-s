import java.util.Scanner;

public class SumOfDIgit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumOfDigit = 0;
        int original_n = n;
        while(n > 0){
            sumOfDigit += n%10;
            n /= 10;
        }
        System.out.println("sum of digit of "+original_n+ " is : "+sumOfDigit);

    }

}
