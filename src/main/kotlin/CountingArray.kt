import java.util.*

fun main() {
//    val size = readln().toInt()
//    val array = IntArray(size)
//    for (i in 0..array.lastIndex) {
//        array[i] = readln().toInt()
//    }
//    var searchedArray = readln().toInt()
//    var total = 0;
//    for (i in array) {
//        if (i == searchedArray) total++;
//    }
//    println(total)

//    val nums = IntArray(readln()!!.toInt()) { readln().toInt() }
//    val m = readln().toInt()
//    println(nums.count { it == m })
//
//

//    val nums = IntArray(readln().toInt()) { readln().toInt() }
//    val originalArray = nums.copyOf()
//    for (i in nums.indices) {
//        if (i == 0) {
//            nums[i] = nums[nums.lastIndex]
//            continue;
//        }
//        nums[i] = originalArray[i - 1]
//    }
//    println(nums.joinToString(" "))

//    val scanner = Scanner(System.`in`)
//    val array = IntArray(scanner.nextInt())
//    for (i in 1..array.size) {
//        array[i % array.size] = scanner.nextInt()
//    }
//    println(array.joinToString(" "))

    val array = IntArray(readln().toInt()) { readln().toInt() }
    val search = readln().toInt()
    if (array.contains(search)) println("YES") else println("NO")
}