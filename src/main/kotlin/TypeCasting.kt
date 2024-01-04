fun countStrings(list: List<Any>) = list.count { it is String }

fun <T> getStringsOnly(list: List<T>) = list.filter { it is String }
fun multiplyInts(list: List<Any>): List<Any> {
    val result = mutableListOf<Any>()
    for (item in list) {
        when (item) {
            is Int -> result.add(item * 2)
            !is Int -> result.add(item)
        }
    }
    return result
}


fun main() {
    val list1 = listOf("apple", "banana", "orange")
    val list2 = listOf("banana", "orange", "grapefruit", "apple")

    val allElementsInList = allElementsInList(list1, list2)
    println(allElementsInList)
}

fun <T> allElementsInList(list1: List<T>, list2: List<T>): Boolean {
    for (element in list1) {
        if (!list2.contains(element as? T)) {
            return false
        }
    }
    return true
}
