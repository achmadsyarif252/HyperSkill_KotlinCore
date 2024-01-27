fun main() {
    val sb = StringBuilder()
    with(sb) {
        append("Achmad ")
        append("Syarif")
    }
    println(sb)

    val sb2 = StringBuilder(100)//defince the limit
    sb2.append("Software Engineer")

    val sb3 = buildString {//using function
        append("Achmad ")
        append("Syarif")
    }
    println(sb2)
    println(sb3)

    val str = buildString {
        append("Kotlin v")
        append(1.8)
    }
    println(str)

    val str2 = buildString {
        append("Hello World")
        append(5, ",")
    }
    println(str2)

    val str3 = buildString {
        append("That's impossible!")
        delete(7, 9)
    }
    println(str3)

    var str4 = buildString {
        append("one, two, two, ...")
        replace(10, 13, "three")
    }
    println(str4)

    var str5 = buildString {
        append("Hello, Kotlin!")
        reverse()
    }
    println(str5)

    val sb1 = StringBuilder()              // Capacity = initial capacity = 16
    println("Capacity: ${sb1.capacity()}") // Output: Capacity: 16

    sb1.append("0123456789abcdef")         // (oldCapacity >= newLength) then: newCapacity = oldCapacity
    println("Capacity: ${sb1.capacity()}") // Output: Capacity: 16

    sb1.append('g')                        // // (oldCapacity < newLength) then: newCapacity = max(oldCapacity * 2 + 2, newLength) = oldCapacity * 2 + 2
    println("Capacity: ${sb1.capacity()}") // Output: Capacity: 34

    sb1.append("jskaaaaaaaaaaaaaaaaaaaaaaaaaa")
    println(sb1.capacity())

    val sb4 = StringBuilder()
    sb4.append("Achmad")
    sb4.setLength(0)
    sb4.append("Syarif")
    println(sb4)

    val sb5 = StringBuilder()
    sb5.append("Java")
    println(sb5.toString()) // Output: Java
    sb5.setLength(0)
    sb5.append("Kotlin")
    println(sb5.toString()) // Output: Kotlin
    println("OKOKOKOK")

    val secretMessage = "MXQE!"

    val encryptedMessage = buildString {
        for (char in secretMessage) {
            if (char.isLetter()) {
                val shiftedChar = char.code + 3
                val wrappedChar = if (shiftedChar > 'Z'.code) {
                    'A' + (shiftedChar - 'Z'.code - 1)
                } else {
                    shiftedChar.toChar()
                }
                append(wrappedChar)
            } else {
                append(char)
            }
        }
    }

    println(encryptedMessage)

    val encryptedMesg = "THe mAtRIX HAs YOu"
    val decoded = buildString {
        encryptedMesg.forEach {
            if (it.lowercase() in "aiueo") append(it) else if (it in 'b'..'z') append(it.uppercase())
        }
    }
    println(decoded)

    println(concatenate(listOf("one", "two", "three", "four", "five"), "-"))
}

fun decodeMessage(encodedMessage: String): String {
    val decoded = buildString {
        for (i in encodedMessage) {
            if (i.lowercase() in listOf("a", "i", "u", "e", "o")) {
                append(i)
            } else if (i.isLowerCase()) {
                append(i.uppercase())
            }
        }
    }
    return (decoded)
}

fun concatenate(list: List<String>, separator: String): String {
    return buildString {
        list.forEach {
            append(
                if (isEmpty()) "" else {
                    separator
                } + it
            )
        }
    }
}

