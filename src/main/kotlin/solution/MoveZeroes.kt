package solution

class MoveZeroes : Solution {
    override fun execute(): String? {
        val nums = intArrayOf(0, 1, 0)
        moveZeroesByTwoIndex(nums)
        return nums.contentToString()
    }

    override fun name(): String {
        return "MoveZeroes"
    }

    fun moveZeroes(nums: IntArray): Unit {
        var index = 0
        var lastIndex = nums.size - 1
        while (index < nums.size) {
            if (index > lastIndex) {
                nums[index] = 0
                index += 1
                continue
            }
            if (nums[index] == 0) {
                for (swapIndex in index until lastIndex) {
                    nums[swapIndex] = nums[swapIndex + 1]
                }
                lastIndex -= 1
            }
            if (nums[index] != 0) {
                index += 1
            }
        }
    }

    fun moveZeroesByTwoIndex(nums: IntArray): Unit {
        var writeIndex = 0
        for (index in nums.indices) {
            if (nums[index] != 0) {
                val temp = nums[writeIndex]
                nums[writeIndex] = nums[index]
                nums[index] = temp
                writeIndex += 1
            }
        }
    }
}