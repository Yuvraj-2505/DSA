class Solution {

    public void nextPermutation(int[] nums) {

        // Step 1: Find pivot
        int pivot = -1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: If no pivot, reverse whole array
        if (pivot == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        // Step 3: Find element just greater than pivot
        int j = nums.length - 1;

        while (nums[j] <= nums[pivot]) {
            j--;
        }

        // Step 4: Swap pivot and j
        swap(nums, pivot, j);

        // Step 5: Reverse the right part
        reverse(nums, pivot + 1, nums.length - 1);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}