data class Musician2(val name: String, val band: String, val role: String)

fun main() {
    val musician = Musician2("Ian George Brown", "The Stone Roses", "Frontman")

    with(musician) {
        println(this)
        val nameLength = name.length
        println(nameLength)
    }

    val num = with(musician) {
        name.length
    }.let {
        it / 4
    }.also {
        println(it)
    }.run {
        this + 10
    }

    println(num)


    var poet: String? = readln()

    val coolScope = poet.run {
        println("Our poet is $this")
        this?.all { it == 'a' }
    }

    println(coolScope)

    var poet: String? = readln()

    val coolScope = poet?.run {
        println("Our poet is $this")
        count { it=='a' }
    }
    println(coolScope)

}