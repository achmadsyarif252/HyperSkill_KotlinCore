//data class Musician(var name: String, var instrument: String = "Guitar", var band: String = "Radiohead")
//
//fun main() {
//    Musician("Ariel", "Mic & Drum", "Noah").apply {
//        println(this)
//        name = "Andika"
//        instrument = "Basis"
//        band = "Kangen Band"
//        println(this)
//    }
//
//    val musician = Musician("Dave Grohol", "Drummer", "OkROck")
//    println(musician)
//    musician.band = "Troll Band"
//    println(musician)
//
//    Musician("Jonny Greenwood").apply {
//        instrument = "Harmonica"
//        band = "Pavement"
//    }
//
//    val thom = Musician("Jonny Greenwood").apply {
//        instrument = "Harmonica"
//        band = "Pavement"
//    }.copy(name = "Thom York")
//
//    println(thom)
//
//    //also
//    val instrument = mutableListOf("Guitar", "Harmonica", "Bass guitar")
//
//    instrument.also {
//        println("Right now I can play there instruments : $it")
//    }.add("Theremin")
//
//    var a = 10;
//    var b = 5;
//    a = b.also { b = a }
//    println("a = $a, b = $b")
//}
//


data class TextField(
    var text: String = "Hello!",
    var textSize: Int = 12,
    var fontFamily: String = "Roboto"
)

fun main() {
    val textField = TextField()

    val valuesMap = mapOf<String, Int>(
        "Cancel" to 12,
        "Button" to 14,
        "Submit" to 13
    )

//    textField
//        .apply {
//            text = readln()!!
//            textSize = valuesMap.getValue(text)
//        }
//        .also { println("New settings: $it") }

    val musicians = mutableListOf("Thom", "Jonny Greenwood", "Colin Greenwood")
    val firstAndLast = with(musicians) {
        "First list element - ${first()}," +
                " last list element - ${last()}"
    }
    println(firstAndLast) // We create a new variable firstAndLast and pass the result of calculations inside the function body to it. After that we print this variable.

    val modifiedFirstItem = musicians.first().let { firstItem ->
        println("The first item of the list is $firstItem")
        if (firstItem.length >= 5) firstItem else "!" + firstItem + "!"
    }.uppercase()
    println("First item after modifications :$modifiedFirstItem")
    val numbers = listOf(2, 5, 25, 1089, 4)
    val value = with(numbers) {
        var numbers = this
        this.drop(5)
        numbers.lastOrNull()
    }

    println(value)

    val musician = Musician()

    musician.apply {
        name = readln()
        band = readln()
        role = readln()
    }

    with(musician) {
        println("Name : ${this.name}")
        println("Band : ${this.band}")
        println("Role : ${this.role}")
    }

    println("Ian George Brown".length)
}

data class Musician(var name: String = "", var band: String = "", var role: String = "")
