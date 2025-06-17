import java.util.Scanner;

public class InsertionSorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// scanner object created so that you can change the code and make user
                                               // to input the element of the array
        int arr[] = { 3, 4, 2, 8, 7, 9, 1 };
        System.out.println(" the array before sorting is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;

            int temp = arr[i];

            if (temp < arr[j]) {
                while (j >= 0 && temp < arr[j]) {

                    arr[j + 1] = arr[j];
                    j--;

                }
                arr[j + 1] = temp;
            }
        }
        System.out.println(" The array after sorting is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        input.close();
    }
}