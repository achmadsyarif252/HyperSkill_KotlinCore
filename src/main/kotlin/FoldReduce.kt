fun main() {
    val list = listOf(1, 2, 3, 4, 5)

    var sum = list.fold(0) { acc, i ->
        println("acc: $acc, i:$i, acc + i: ${acc + i}")
        acc + i
    }
    println(sum)

    var product = list.fold(1) { acc, i ->
        println("acc : $acc,i:$i, acc + i:${acc + i}")
        acc + i
    }

    println(product)

    //reduce uses the first element as the initial
    sum = list.reduce { acc, i ->
        println("acc: $acc, i: $i, acc + i: ${acc + i}")
        acc + i
    }
    println(sum)

    product = list.reduce { acc, i ->
        acc * i
    }

    println(product)
}