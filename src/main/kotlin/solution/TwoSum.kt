package solution

class TwoSum : Solution {
    override fun execute(): String? {
        return twoSum(intArrayOf(3, 2, 4), 6).contentToString()
    }

    override fun name(): String {
        return "TwoSum"
    }

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numsMap = mutableMapOf<Int, Int>()
        for (index in nums.indices) {
            numsMap[(target - nums[index])]?.let {
                if (index != it) {
                    return intArrayOf(index, it)
                }
            }
            numsMap[nums[index]] = index
        }
        return intArrayOf()
    }
}