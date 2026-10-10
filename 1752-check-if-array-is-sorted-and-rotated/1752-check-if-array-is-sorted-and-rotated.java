// class Solution {
//     public boolean check(int[] nums) {
//         int n = nums.length;
//         int k = 0;
//         for(int i = 0; i < nums.length - 1; i++){
//             if(nums[i] > nums[i+1]){
//                 k = n - i - 1;
//                 break;
//             }   
//         }
//         k %= n;
//         reversearr(nums,0,n-k-1);
//         reversearr(nums,n-k,n-1);
//         reversearr(nums,0,n-1);
//         for(int i = 0; i < nums.length - 1; i++){
//             if(nums[i] > nums[i+1]){
//                 return false;
//             }   
//         }
//         return true;
//     }
//     static void reversearr(int[] nums, int i, int j){
//         while(i<j){
//             int temp = nums[i];
//             nums[i] = nums[j];
//             nums[j] = temp;
//             i++;
//             j--;
//         }
        
//     }
// }

class Solution {
    public boolean check(int[] nums) {

        int count = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++) {

            if(nums[i] > nums[(i + 1) % n]) {
                count++;
            }

            if(count > 1) {
                return false;
            }
        }

        return true;
    }
}