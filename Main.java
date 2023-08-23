class Solution {
    public int maxProfit(int[] prices) {
        // Initialize variables
        int lsf = Integer.MAX_VALUE; // lsf: Local Smallest Future (potential buying point)
        int op = 0; // op: Overall Profit
        int pist = 0; // pist: Potential Individual Stock Transaction (current price - lsf)

        // Loop through the prices array
        for (int i = 0; i < prices.length; i++) {
            // Check if the current price is lower than the previously observed lowest price (lsf)
            if (prices[i] < lsf) {
                lsf = prices[i]; // Update lsf to the current price
            }
            // Calculate the potential profit of selling at the current price
            pist = prices[i] - lsf;
            // Check if the potential profit is greater than the overall profit (op)
            if (op < pist) {
                op = pist; // Update op to the potential profit if it's greater
            }
        }

        return op; // Return the overall maximum profit
    }
}
