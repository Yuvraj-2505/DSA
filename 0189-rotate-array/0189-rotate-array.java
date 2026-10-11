class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reversearr(nums,0,n-k-1);
        reversearr(nums,n-k,n-1);
        reversearr(nums,0,n-1);
    }
    static void reversearr(int[] nums, int i, int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        
    }
}