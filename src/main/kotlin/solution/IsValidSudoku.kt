package solution

class IsValidSudoku : Solution {
    override fun name(): String {
        return "IsValidSudoku"
    }

    override fun execute(): String? {
        val board: Array<CharArray> = arrayOf(
            charArrayOf('.', '.', '.', '.', '5', '.', '.', '1', '.'),
            charArrayOf('.', '4', '.', '3', '.', '.', '.', '.', '.'),
            charArrayOf('.', '.', '.', '.', '.', '3', '.', '.', '1'),
            charArrayOf('8', '.', '.', '.', '.', '.', '.', '2', '.'),
            charArrayOf('.', '.', '2', '.', '7', '.', '.', '.', '.'),
            charArrayOf('.', '1', '5', '.', '.', '.', '.', '.', '.'),
            charArrayOf('.', '.', '.', '.', '.', '2', '.', '.', '.'),
            charArrayOf('.', '2', '.', '9', '.', '.', '.', '.', '.'),
            charArrayOf('.', '.', '4', '.', '.', '.', '.', '.', '.'),
        )
        return isValidSudoku(board).toString()
    }

    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val groupSetArray = arrayOfNulls<MutableSet<Char>>(9)
        val rowSetArray = arrayOfNulls<MutableSet<Char>>(9)
        val colSetArray = arrayOfNulls<MutableSet<Char>>(9)
        val validator = { setArray: Array<MutableSet<Char>?>, index: Int, value: Char ->
            var set = setArray[index]
            if (set == null) {
                set = mutableSetOf()
                setArray[index] = set
            }
            set.add(value)
        }
        for (rowIndex in 0 until 9) {
            val row = board[rowIndex]
            for (colIndex in 0 until 9) {
                val value = row[colIndex]
                if (value == '.')
                    continue

                val groupIndex = (rowIndex / 3) * 3 + colIndex / 3
                if (!validator(rowSetArray, rowIndex, value) || !validator(colSetArray, colIndex, value) ||
                    !validator(groupSetArray, groupIndex, value)
                )
                    return false
            }
        }
        return true
    }
}