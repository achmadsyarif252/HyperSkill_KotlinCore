fun main() {
    val originalList = readln().split(" ").map { it }.toMutableList()
    val originalSet = originalList.toMutableSet()

    println(addElements(originalList))
    println(addElements(originalSet))
}

fun addElements(list: Collection<String>) = list.reversed()