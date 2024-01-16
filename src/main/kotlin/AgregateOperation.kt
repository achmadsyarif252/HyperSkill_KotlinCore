fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    //Min and Max
    println(numbers.minOrNull())
    println(numbers.maxOrNull())

    //Average
    println(numbers.average())

    //sum
    println(numbers.sum())

    println(numbers.count())

    val words = listOf("achmad", "syarif", "dimas", "achmad", "dayat", "lely", "rizky")
    //counte
    println(words.count())

    //maxByOrNull/minByOrNull
    println(words.maxByOrNull { it.length })
    println(words.minByOrNull { it.length })

    //maxOfOrNull/minOfOrNull
    println(words.maxOfOrNull { it.length })
    println(words.minOfOrNull { it.length })

    //sumOf
    println(words.sumOf { it.length })

    //using predicates,length>5
    println(words.count { it.length > 5 })
    println(words.maxByOrNull { it.length > 5 })
    println(words.minByOrNull { it.length > 5 })

    //Emptylist
    val emptyWordList = emptyList<String>()
    println(emptyWordList.count())
    println(emptyWordList.maxByOrNull { it.length })
    println(emptyWordList.minByOrNull { it.length })
    println(emptyWordList.maxOfOrNull { it.length })
    println(emptyWordList.minOfOrNull { it.length })
    println(emptyWordList.maxOf { it.length })
    println(emptyWordList.minOf { it.length })
    println(emptyWordList.maxBy { it.length })
    println(emptyWordList.minBy { it.length })

    val words2 = listOf("anne", "michael", "caroline", "dimitry", "emilio")

    // MaxWithOrNull/MinWithOrNull
    println(words2.maxWithOrNull(compareBy { it.length })) // caroline
    println(words2.minWithOrNull(compareBy { it.length })) // anne

    // maxOfWithOrNull/minOfWithOrNull
    println(words2.maxOfWithOrNull(naturalOrder()) { it.length }) // 8
    println(words2.minOfWithOrNull(naturalOrder()) { it.length }) // 4

    // count
    println(words2.count { it.first() == 'a' }) // 1

    val words3 = listOf("peter", "anne", "michael", "caroline")

    // ordering by length reversed
    println(words3.sortedWith(compareBy { it.length }).reversed()) // [caroline, michael, peter, anne]

    // ordering by middle letter reversed
    println(words3.sortedWith(compareBy { it[it.length / 2] }).reversed()) // [peter, anne, caroline, michael]
}