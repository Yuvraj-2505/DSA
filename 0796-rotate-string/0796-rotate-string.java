class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        char[] arr = s.toCharArray();
        char[] last = goal.toCharArray();
        int n = arr.length;

        int i = 0;
        while(i < n){
            if(Arrays.equals(arr,last)){
                return true;
            }
            char firstChar = arr[0];

            for (int k = 0; k < n - 1; k++) {
                arr[k] = arr[k + 1];
            }

            arr[n - 1] = firstChar;

            i++;
        }

        return false;
    }
}

// class Solution {
//     public boolean rotateString(String s, String goal) {

//         if (s.length() != goal.length()) {
//             return false;
//         }

//         char[] arr = s.toCharArray();
//         char[] last = goal.toCharArray();
//         int n = arr.length;

//         for (int shift = 0; shift < n; shift++) {

//             boolean same = true;

//             for (int i = 0; i < n; i++) {
//                 if (arr[i] != last[i]) {
//                     same = false;
//                     break;
//                 }
//             }

//             if (same) {
//                 return true;
//             }

//             // Left shift by one position
//             char firstChar = arr[0];

//             for (int k = 0; k < n - 1; k++) {
//                 arr[k] = arr[k + 1];
//             }

//             arr[n - 1] = firstChar;
//         }

//         return false;
//     }
// }