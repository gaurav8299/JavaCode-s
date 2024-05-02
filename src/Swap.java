import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,51, 87};
 //       swap(arr, 1, 2);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;

            swap(arr, start, end);
            start++;
            end--;
        }

    }
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
