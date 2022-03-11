import solution.*

fun main(args: Array<String>) {
    executeSolution(INTERSECT)
}

const val REMOVE_DUPLICATES = "RemoveDuplicates"
const val MAX_PROFIT = "MaxProfit"
const val ROTATE = "Rotate"
const val CONTAINS_DUPLICATE = "ContainsDuplicate"
const val INTERSECT = "Intersect"

fun executeSolution(name: String) {
    val solution = when (name) {
        REMOVE_DUPLICATES -> RemoveDuplicates()
        MAX_PROFIT -> MaxProfit()
        ROTATE -> Rotate()
        CONTAINS_DUPLICATE -> ContainsDuplicate()
        INTERSECT -> Intersect()
        else -> null
    }

    solution?.apply {
        println(name() + " result " + execute())
    }

}
