//fun main() {
//    val word = readln()
//    val listChara = mutableListOf<Char>()
//    val deletedChar = mutableListOf<Char>()
//    for (i in word) {
//        if (listChara.contains(i)) {
//            deletedChar.add(i)
//        } else {
//            listChara.add(i)
//        }
//    }
//    listChara.removeAll(deletedChar)
//    println(listChara.size)
//}

fun main() {
//    val word = readLine()!!
//    val charCounts = mutableMapOf<Char, Int>()
//
//    for (char in word) {
//        charCounts[char] = charCounts.getOrDefault(char, 0) + 1
//    }
//
//    println(charCounts)
//
//    val uniqueCount = charCounts.count { it.value == 1 }
//    println(uniqueCount)

    println(20.tambah10())
    println(20.tambah20)
}

fun Int.tambah10(): Int {
    return this + 10;
}

val Int.tambah20
    get() = this + 20;
