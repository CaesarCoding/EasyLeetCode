package solution

class ContainsDuplicate : Solution {
    override fun execute(): String? {
         return containsDuplicateBySorting(intArrayOf(1,2,3,3)).toString()
    }

    override fun name(): String {
        return "ContainsDuplicate"
    }

    fun containsDuplicate(nums: IntArray): Boolean {
        val hashSet = HashSet<Int>()
        nums.forEach {
            if (!hashSet.add(it)){
                return true
            }
        }
        return false
    }

    fun containsDuplicateBySorting(nums: IntArray): Boolean {
        nums.sort()
        var index = 0
        while (index < nums.size - 1){
            if(nums[index] == nums[index + 1]){
                return true
            }
            index += 1
        }
        return false
    }
}