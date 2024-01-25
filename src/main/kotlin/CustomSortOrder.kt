fun main() {
//    val words = listOf("peter", "anne", "michael", "caroline")
//
//    // sorted by word length
//    println(words.sortedBy { it.length }) // [anne, peter, michael, caroline]
//    println(words.sortedByDescending { it.length }) // [caroline, michael, peter, anne]
//
//    // sorted by first letter
//    println(words.sortedBy { it.first() }) // [anne, caroline, michael, peter]
//    println(words.sortedByDescending { it.first() }) // [peter, michael, caroline, anne]
//
//    // sorted by the last letter
//    println(words.sortedBy { it.last() }) // [anne, caroline, michael, peter]
//    println(words.sortedByDescending { it.last() }) // [peter, michael, anne, caroline]
    val words = listOf("peter", "anne", "michael", "caroline")

    // define a comparator for the list of words
    val wordsLengthComparator = Comparator { str1: String, str2: String -> str1.length - str2.length }
    // Ordered list according to the comparator
    println(words.sortedWith(wordsLengthComparator)) // [anne, peter, michael, caroline]

    // another comparator using the middle letter
    val middleLetterComparator =
        Comparator { str1: String, str2: String -> str1[str1.length / 2] - str2[str2.length / 2] }

    // Ordered list according to the comparator
    println(words.sortedWith(middleLetterComparator)) // [michael, caroline, anne, peter]

}