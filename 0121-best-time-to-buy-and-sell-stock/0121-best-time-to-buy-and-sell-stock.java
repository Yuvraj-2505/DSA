class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            // Minimum buying price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Profit if we sell today
            int profit = prices[i] - minPrice;

            // Maximum profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}
// class Solution {
//     public int maxProfit(int[] prices) {
//         int sml = Integer.MAX_VALUE;
//         int max = Integer.MIN_VALUE;
//         int pft = 0;
//         for(int i = 0; i < prices.length; i++){
//             if(sml > prices[i]){
//                 sml = prices[i];
//             }
//         }
//         for(int i = sml + 1; i < prices.length ; i++){
//             if(sml == prices[prices.length-1]) return 0;
//             else if(max < prices[i]){
//                 max = prices[i];
//             }
//         }
//         pft = max - sml;
//         return pft;
//     }
// }