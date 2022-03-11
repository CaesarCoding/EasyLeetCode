package solution

class PlusOne : Solution {
    override fun execute(): String? {
        return plusOne(intArrayOf(1, 2, 9, 8)).contentToString()
    }

    override fun name(): String {
        return "PlusOne"
    }

    fun plusOne(digits: IntArray): IntArray {
        for (index in digits.size - 1 downTo 0) {
            var value = digits[index]
            value = if (value == 9) 0 else value + 1
            digits[index] = value
            if (value != 0) {
                break
            }
        }
        if (digits.first() == 0) {
            return digits.toMutableList().apply {
                add(0, 1)
            }.toIntArray()
        }
        return digits
    }
}
