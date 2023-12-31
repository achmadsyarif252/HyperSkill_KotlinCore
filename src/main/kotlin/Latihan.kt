fun main() {
    val nums = IntArray(readln().toInt()) { readln().toInt() }
    val rotate = readln().toInt()
    val originalArray = nums.copyOf()
    for (i in nums.indices) {
        if (i == 0) {
            nums[i] = nums[nums.lastIndex]
            continue;
        }
        nums[i] = originalArray[i - (rotate % 5)]
    }
    println(nums.joinToString(" "))
}
