import java.util.Arrays;

public class Sot {
    public static void main(String[] args) {

        int[] arr = {4, 5, 63, 45, 66, 33};
        int[] arr1 = {55, 33, 23, 12, 17, 6, 5};

        bubble(arr, 5, 0);
        selection(arr1, 7, 0, 0);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }

    // Bubble Sort
    static void bubble(int[] arr, int r, int c) {

        if (r == 0) {
            return;
        }

        if (c < r) {

            if (arr[c] > arr[c + 1]) {

                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }

            bubble(arr, r, c + 1);

        } else {

            bubble(arr, r - 1, 0);
        }
    }

    // Selection Sort
    static void selection(int[] arr1, int r, int c, int max) {

        if (r == 0) {
            return;
        }

        if (c < r) {

            if (arr1[c] > arr1[max]) {
                selection(arr1, r, c + 1, c);
            } else {
                selection(arr1, r, c + 1, max);
            }

        } else {

            int temp = arr1[max];
            arr1[max] = arr1[r - 1];
            arr1[r - 1] = temp;

            selection(arr1, r - 1, 0, 0);
        }
    }
}