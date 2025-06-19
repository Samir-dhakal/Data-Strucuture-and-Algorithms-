import java.util.Scanner;

public class MergeSorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nums[] = { 29, 13, 445, 3, 9, 7, 34 };
        System.out.println(" The array before sorting is :");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        mergeShort(nums, 0, nums.length - 1);
        System.out.println();
        System.out.println(" The array after  sorting is :");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        input.close();
    }

    private static void mergeShort(int[] nums, int l, int r) {

        if (l < r) {
            int mid = (l + r) / 2;// midpoint to devide the arary in two part
            mergeShort(nums, l, mid);
            mergeShort(nums, mid + 1, r);
            mrege(nums, l, mid, r);
        }
    }

    private static void mrege(int[] nums, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int larr[] = new int[n1];
        int rarr[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            larr[i] = nums[l + i];
        }
        for (int i = 0; i < n2; i++) {
            rarr[i] = nums[mid + 1 + i];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (larr[i] <= rarr[j]) {
                nums[k] = larr[i];
                i++;

            } else {
                nums[k] = rarr[j];
                j++;
            }
            k++;
        }
        // copying the remaining remaning array of the left or right array in the main
        // array
        while (i < n1) {
            nums[k] = larr[i];
            i++;
            k++;

        }
        while (j < n2) {
            nums[k] = rarr[j];
            j++;
            k++;

        }
    }
}