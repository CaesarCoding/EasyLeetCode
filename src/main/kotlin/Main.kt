import solution.MaxProfit
import solution.RemoveDuplicates
import solution.Solution

fun main(args: Array<String>) {
    executeSolution(MAX_PROFIT)
}

const val REMOVE_DUPLICATES = "RemoveDuplicates"
const val MAX_PROFIT = "MaxProfit"


fun executeSolution(name: String) {
    val solution = when (name) {
        REMOVE_DUPLICATES -> RemoveDuplicates()
        MAX_PROFIT -> MaxProfit()
        else -> null
    }

    solution?.apply {
        println(name() + " result " + execute())
    }

}
