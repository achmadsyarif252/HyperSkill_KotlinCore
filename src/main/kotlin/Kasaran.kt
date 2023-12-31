fun main() {
    var list = readln().split(" ")
    val wordCounts = mutableMapOf<String, Int>()
    val wordOrder = mutableListOf<String>()

    for (word in list) {
        wordCounts[word] = wordCounts.getOrDefault(word, 0) + 1
        if (!wordOrder.contains(word)) {
            wordOrder.add(word)
        }
    }

    for (word in wordOrder) {
        println("$word ${wordCounts[word]}")
    }
}
