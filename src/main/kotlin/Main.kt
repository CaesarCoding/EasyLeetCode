import solution.*

fun main(args: Array<String>) {
    executeSolution(IS_VALID_SUDOKU)
}

const val REMOVE_DUPLICATES = "RemoveDuplicates"
const val MAX_PROFIT = "MaxProfit"
const val ROTATE = "Rotate"
const val CONTAINS_DUPLICATE = "ContainsDuplicate"
const val SINGLE_NUMBER = "SingleNumber"
const val INTERSECT = "Intersect"
const val PLUS_ONE = "PlusOne"
const val MOVE_ZEROES = "MoveZeroes"
const val TWO_SUM = "TwoSum"
const val IS_VALID_SUDOKU = "IsValidSudoku"

fun executeSolution(name: String) {
    val solution = when (name) {
        REMOVE_DUPLICATES -> RemoveDuplicates()
        MAX_PROFIT -> MaxProfit()
        ROTATE -> Rotate()
        CONTAINS_DUPLICATE -> ContainsDuplicate()
        SINGLE_NUMBER -> SingleNumber()
        INTERSECT -> Intersect()
        PLUS_ONE -> PlusOne()
        MOVE_ZEROES -> MoveZeroes()
        TWO_SUM -> TwoSum()
        IS_VALID_SUDOKU -> IsValidSudoku()
        else -> null
    }

    solution?.apply {
        println(name() + " result " + execute())
    }

}
