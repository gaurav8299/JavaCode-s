import java.util.Scanner;

public class HollowTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == r) {
                    System.out.print(j + " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}