package solution

class SingleNumber : Solution {
    override fun execute(): String? {
        return singleNumberByXOR(intArrayOf(4, 1, 2, 1, 2)).toString()
    }

    override fun name(): String {
        return "SingleNumber"
    }

    fun singleNumber(nums: IntArray): Int {
        val hashSet = HashSet<Int>()
        nums.forEach {
            if (!hashSet.remove(it)) {
                hashSet.add(it)
            }
        }
        return hashSet.first()
    }

    fun singleNumberBySorting(nums: IntArray): Int {
        nums.sort()
        var index = 0
        while (index < nums.size - 2) {
            nums[index].let {
                if (it != nums[index + 1]) {
                    return it
                }
            }
            index += 2
        }
        return nums.last()
    }

    fun singleNumberByXOR(nums: IntArray): Int {
        var result = 0
        nums.forEach {
            result = result xor it
        }
        return result
    }
}