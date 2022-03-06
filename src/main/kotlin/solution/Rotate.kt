package solution

class Rotate : Solution {
    override fun execute(): String? {
        val nums = intArrayOf(-1, -100, 3, 99)
        rotate(nums, 2)
        val numsString = StringBuffer()
        nums.forEach {
            numsString.append(it)
            numsString.append(',')
        }
        return numsString.toString()
    }

    override fun name(): String {
        return "Rotate"
    }

    fun rotate(nums: IntArray, k: Int): Unit {
        val copyNums = nums.copyOf()
        var index = 0
        while (index < copyNums.size) {
            var rotatedIndex = index + k
            if (rotatedIndex >= copyNums.size) {
                rotatedIndex %= copyNums.size
            }
            nums[rotatedIndex] = copyNums[index]
            index += 1
        }
    }
}