import java.util.Scanner;

// Binary search only work for the sorted array 
public class BinarySearch {
    public static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int midpoint;
        while (start <= end) {
            midpoint = (start + end) / 2;
            if (target == nums[midpoint]) {

                return midpoint;
            } else if (target < nums[midpoint]) {
                end = midpoint - 1;
            } else {
                start = midpoint + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int target = 4;
        int result = binarySearch(nums, target);
        if (result != -1)
            System.out.println("The target is in " + result + "th index of the array ");
        else
            System.out.println("The element is not in array ");
        input.close();
    }
}