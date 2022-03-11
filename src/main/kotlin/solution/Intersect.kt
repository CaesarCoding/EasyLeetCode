package solution

class Intersect : Solution {
    override fun execute(): String? {
        return intersectBySorting(intArrayOf(1, 2, 2, 1), intArrayOf(2)).contentToString()
    }

    override fun name(): String {
        return "Intersect"
    }

    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val result = mutableListOf<Int>()
        val indexMap = mutableMapOf<Int, Int>()
        var startIndex = 0
        nums1.forEach {
            startIndex = indexMap[it]?.run {
                this + 1
            } ?: 0
            for (index in startIndex until nums2.size) {
                if (nums2[index] == it) {
                    result.add(it)
                    indexMap[it] = index
                    break
                }
            }
        }
        return result.toIntArray()
    }

    fun intersectByCounting(nums1: IntArray, nums2: IntArray): IntArray {
        val countingMap = hashMapOf<Int, Int>()
        val resultList = mutableListOf<Int>()
        for (value in nums1){
            val count = countingMap[value]?.let {
                it + 1
            } ?: 1
            countingMap[value] = count
        }
        for (value in nums2){
            val count = countingMap[value] ?: 0
            if (count > 0){
                resultList.add(value)
                countingMap[value] = count - 1
            }
        }
        return resultList.toIntArray()
    }

    fun intersectBySorting(nums1: IntArray, nums2: IntArray): IntArray {
        val resultList = mutableListOf<Int>()
        nums1.sort()
        nums2.sort()
        var index1 = 0
        var index2 = 0
        while (index1 < nums1.size && index2 < nums2.size) {
            val value1 = nums1[index1]
            val value2 = nums2[index2]
            if (value1 == value2){
                resultList.add(value1)
                index1 += 1
                index2 += 1
            } else if (value1 < value2){
                index1 += 1
            } else {
                index2 += 1
            }
        }
        return resultList.toIntArray()
    }
}