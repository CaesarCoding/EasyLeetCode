import solution.MaxProfit
import solution.RemoveDuplicates
import solution.Rotate

fun main(args: Array<String>) {
    executeSolution(ROTATE)
}

const val REMOVE_DUPLICATES = "RemoveDuplicates"
const val MAX_PROFIT = "MaxProfit"
const val ROTATE = "Rotate"

fun executeSolution(name: String) {
    val solution = when (name) {
        REMOVE_DUPLICATES -> RemoveDuplicates()
        MAX_PROFIT -> MaxProfit()
        ROTATE -> Rotate()
        else -> null
    }

    solution?.apply {
        println(name() + " result " + execute())
    }

}
