import java.util.Scanner;

public class RectPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        for(int i = 0; i <= r; i++){
            for (int j = 0; j <= c; j++){
                if(i == 1 || i == r || j == 1 || j == c)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}