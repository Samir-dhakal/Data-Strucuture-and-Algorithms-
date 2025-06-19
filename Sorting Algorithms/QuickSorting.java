import java.util.Scanner;

public class QuickSorting {
    // funciton to find out the povit element
    // povit element is the reference to do divide and it should be in correct
    // location
    public static int partation(int[] arr, int low, int high) {
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < arr[high]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i = i + 1;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }

    public static void quickShort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partation(arr, low, high);
            quickShort(arr, low, pi - 1);
            quickShort(arr, pi + 1, high);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = { 1, 9, 6, 8, 4, 1, 7, 2 };
        System.out.println(" The array before sorting is :");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        quickShort(arr, 0, arr.length - 1);
        System.out.println(" The array after sorting using quick sort is :");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        input.close();
    }
}