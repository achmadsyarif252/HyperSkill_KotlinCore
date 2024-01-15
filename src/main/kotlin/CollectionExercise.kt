data class Spell(val name: String, val power: Int)

fun main() {
    val originalList = readln().split(" ")
    val originalSet = originalList.toSet()
    val word = readln()

    println(dropElements(originalList, word))
    println(dropElements(originalSet, word))

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val words = listOf("anne", "michael", "caroline", "dimitry", "emilio")

    mappingNullableCollections(numbers, words)

    mapAndMapping()
    flattenMap()

    val list = readln().split(" ")
    // write your code here
    val res = list.map { it.last() }
    println(res)

    val input = readln().split(" ")
    val spells = input.map { Spell(it.split("-")[0], it.split("-")[1].toInt()) }

    // write your code here
    val res2 = spells.filter { it.power >= 40 }.map { it.name }
    println(res2)
}

//flattern/flatMap
fun flattenMap() {
    val nestedNumbers = listOf(listOf(1, 2, 3), listOf(4, 5, 6), listOf(7, 8, 9))
    val nestedWords = listOf(
        listOf("anne", "michael"),
        listOf("caroline", "dimitry"),
        listOf("emilio", "francois")
    )

    println(nestedNumbers.flatten())
    println(nestedWords.flatten())

    //FlatMap example
    println(nestedNumbers.flatMap {
        it.map { it * 2 }
    })

    println(nestedWords.flatMap {
        it.map { it.uppercase() }
    })

    //List of maps to flat map
    val listOfMaps = listOf(
        mapOf(1 to "one", 2 to "two"),
        mapOf(3 to "three", 4 to "four")
    )

    val resMapFlattern = listOfMaps.flatMap { it.entries }
        .associate { it.key to it.value }
    println(resMapFlattern)

    // list of list of list to flat list
    val listOfListOfList = listOf(
        listOf(listOf(1, 2, 3), listOf(4, 5, 6)),
        listOf(listOf(7, 8, 9), listOf(10, 11, 12))
    )
    val resListFlatten = listOfListOfList
        .flatMap { it.flatten() } // or .flatten().flatten()
    println(resListFlatten) // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]

}

//map and mapping
fun mapAndMapping() {
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")

    println(map.map { it.key })//[1,2,3]
    println(map.map { it.value })

    println(map.mapKeys { it.key * 2 })
    println(map.mapValues { it.value.uppercase() })

    //Map numbers to words
    val numbersToWords = mapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
    //key and length of value
    println(numbersToWords.mapValues {
        it.value.length
    })

    //reversed value where the key is even
    println(numbersToWords.mapValues {
        if (it.key % 2 == 0) it.value.reversed() else it.value
    })


}

fun mappingNullableCollections(numbers: Collection<Int>, words: Collection<String>) {
    //mapping null
    println(numbers.map {
        if (it % 2 == 0) it else null
    })
    println(numbers.mapNotNull { x ->
        if (x % 2 == 0) x else null
    })

    //mapping with index null
    println(words.mapIndexed { index, value ->
        if (index % 2 == 0) value.uppercase()
        else null
    })

    println(words.mapIndexedNotNull { index, value ->
        if (index % 2 == 0) value.uppercase()
        else null
    })

    val numbersString = listOf("1", "2", "3", "4", "5a", "6", "7", "8", "9", "10")
    //List of Ints numbers
    //It will return a list of Ints
    val myNumbersWithNulls = numbersString.map { it.toIntOrNull() }
    println(myNumbersWithNulls) // [1, 2, 3, 4, null, 6, 7, 8, 9, 10]

    println(myNumbersWithNulls.filterNotNull())
    val myNumbers = numbersString.mapNotNull { it.toIntOrNull() }
    println(myNumbers)

    //List of words
    val wordsString = listOf("anne", "michael", "caroline", "dimitry", "alicia")
    //map and filter it
    val myWordsWithNulls =
        wordsString.map {
            if (it.startsWith("a"))
                it.uppercase()
            else
                null
        }
    println(myWordsWithNulls) // [ANNE, null, null, null, ALICIA]

    //It will return a list of Strings
    println(myWordsWithNulls.filterNotNull())

    // It will return a list of Strings
    println(myWordsWithNulls.filterNotNull()) // [ANNE, ALICIA]
    val myWords =
        wordsString.mapNotNull {
            if (it.startsWith("a"))
                it.uppercase()
            else
                null
        }
    // It will return a list of Strings
    println(myWords) // [ANNE, ALICIA]
}

fun mapping(numbers: Collection<Int>, words: Collection<String>) {

    //mapping
    println(numbers.map { it * 2 })
    println(words.map { it.uppercase() })

    //mapping with index
    println(numbers.mapIndexed { index, value ->
        index * value
    })

    println(words.mapIndexed { index, value ->
        if (index % 2 == 0) value.uppercase()
        else value
    })

    //list of word lengths
    println(words.map { it.length })

    //list of strings of numbers
    val numbersString = listOf("1", "2", "3", "4", "5a", "6", "7", "8", "9", "10")
    //list of Ints of numbers
    //It will return a list of Int ?
    val myNumbersWithNulls = numbersString.map { it.toIntOrNull() }
    println(myNumbersWithNulls)

    //List of words
    val wordsString = listOf("anne", "michael", "caroline", "dimitry", "alicia")
    //map and filter it
    //It will return a list of Strings (String or null)
    val myWordsWithNulls = wordsString.map {
        if (it.startsWith("a")) it.uppercase() else null
    }
    println(myWordsWithNulls)
}

fun dropElements(originalList: Collection<String>, word: String): List<String> {
    return originalList.filter { it != word }
}