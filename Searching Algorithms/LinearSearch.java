import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        int target = 6;
        int result = linearSearch(nums, target);
        if (result == -1) {
            System.out.println("The target is not present in array");
        } else {
            System.out.println("The target is in " + (result + 1) + "th position of the array");
        }

        input.close();
    }
}