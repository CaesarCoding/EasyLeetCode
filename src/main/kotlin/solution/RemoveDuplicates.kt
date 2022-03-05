package solution

class RemoveDuplicates : Solution {
    override fun execute(): String {
        return removeDuplicates(intArrayOf(1, 1, 2, 2, 3, 4, 5, 5, 5, 11, 11, 13, 101, 103)).toString()
    }

    override fun name(): String {
        return "removeDuplicates"
    }
}

fun removeDuplicates(nums: IntArray): Int {
    var readIndex = 1
    var writeIndex = 1
    while (readIndex < nums.size) {
        if (nums[readIndex] != nums[readIndex - 1]) {
            nums[writeIndex] = nums[readIndex]
            writeIndex += 1
        }
        readIndex += 1
    }
    return writeIndex
}