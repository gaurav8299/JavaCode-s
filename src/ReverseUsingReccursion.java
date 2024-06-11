public class ReverseUsingReccursion {
    public static void main(String[] args) {
        System.out.println(reverse(5467));
    }
    static String reverse(int n) {
        if(n == 0) {
            return "";
        } else {
            return n % 10 + reverse(n / 10);
        }
    }
}
