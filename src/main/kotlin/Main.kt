import solution.ContainsDuplicate
import solution.MaxProfit
import solution.RemoveDuplicates
import solution.Rotate

fun main(args: Array<String>) {
    executeSolution(CONTAINS_DUPLICATE)
}

const val REMOVE_DUPLICATES = "RemoveDuplicates"
const val MAX_PROFIT = "MaxProfit"
const val ROTATE = "Rotate"
const val CONTAINS_DUPLICATE = "ContainsDuplicate"

fun executeSolution(name: String) {
    val solution = when (name) {
        REMOVE_DUPLICATES -> RemoveDuplicates()
        MAX_PROFIT -> MaxProfit()
        ROTATE -> Rotate()
        CONTAINS_DUPLICATE -> ContainsDuplicate()
        else -> null
    }

    solution?.apply {
        println(name() + " result " + execute())
    }

}
