fun main() {
    var set = setOf("cat", "dog", "crocodile", "snake")
    val iterator = set.iterator()

    while (iterator.hasNext()) {
        print(iterator.next() + " ")
    }
    println()

    var map = mapOf("John" to "Chocolate", "Mary" to "sweets", "Sara" to "marmalade")
    var iter = map.iterator()

    iter.forEach { (key, value) ->
        println("$key likes $value")
    }

    //mutable iterator
    val food = mutableSetOf("donuts", "cakes", "tarts")
    val mutableIterator = food.iterator()

    mutableIterator.next()
    mutableIterator.remove()
    println("Result : $food")

    //List iterator
    val strings = listOf("i", "like", "donuts")
    val listIterator = strings.listIterator()

    println("Iterating forwards: ")
    while (listIterator.hasNext()) println(listIterator.next())

    println("Iterating backwards: ")
    while (listIterator.hasPrevious()) {
        print("index : ${listIterator.previousIndex()}")
        println(", value : ${listIterator.previous()}")
    }

    val words = mutableListOf("i","know","Claire")
    val mutableListOperator = words.listIterator()

    mutableListOperator.next()
    mutableListOperator.next()
    mutableListOperator.set("don't know")//i dont't know Claire
    mutableListOperator.add("John")
    println(words)//i, don't know, John, Claire

}