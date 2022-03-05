package solution

class MaxProfit : Solution {
    override fun execute(): String? {
        return maxProfit(intArrayOf(3, 4, 3, 7, 5, 8, 49, 8)).toString()
    }

    override fun name(): String {
        return "maxProfit"
    }

    fun maxProfit(prices: IntArray): Int {
        if (prices.size < 2)
            return 0
        var profit = 0
        var index = 0
        while (index < prices.size - 1) {
            if (prices[index] < prices[index + 1]){
                profit += prices[index + 1] - prices[index]
            }
            index++
        }
        return profit
    }
}