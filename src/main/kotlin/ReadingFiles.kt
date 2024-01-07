import java.io.File
import kotlin.io.path.*

fun main() {
    val seperator = File.separator
    val fileName = "src${seperator}reading.txt"
    val file = File(fileName)
    if (file.exists()) {
        val lines = file.readText(Charsets.US_ASCII)
        println(lines)
    } else {
        println("No such file")
    }
    println("\nCara ke 2\n")

    val fileName2 = "src${seperator}reading.txt"
    val lines2 = File(fileName2).readLines()
    for (line in lines2) {
        println(line)
    }

    println("\nCara Ke 3\n")
    val fileName3 = "src${seperator}reading.txt"
    File(fileName3).forEachLine {
        println(it)
    }

    println("\nCara ke 4")
    val textFile = Path("src${seperator}reading.txt")
    println(textFile.exists())

    val text = textFile.readText()
    val lines = textFile.readLines()
    text.lines().forEach { println(it) }

    val byteFile = Path("src${seperator}reading.txt")
    val bytes = byteFile.readBytes()
    bytes.forEach {
        println(it)
    }

    println("Challenge")
    val files_word = File("src${seperator}words_with_numbers.txt")
    val lines4 = files_word.readLines().count { it -> it.contains("\\d+".toRegex()) }
    println(lines4)

    //Write files
    val myFile = File("D:\\Personal\\Programming\\MyFile.txt")
    myFile.writeText("It is awfully hard work doing nothing!")

    val workingDirectory = System.getProperty("user.dir")
    println(workingDirectory)

    val fileName5 = "MyFile.txt"
    val textToFile = "If we learn to process our code carefully, we’ll grow as programmers."
    File(fileName5).writeText(textToFile)

    File(fileName5).appendText("Achmad Syarif")
    val arrayOfBytes = byteArrayOf(1, 2, 3) // create an array
    File(fileName5).writeBytes(arrayOfBytes)
    File(fileName5).appendBytes(arrayOfBytes)


    myFile.writeText("If we learn to process our code carefully, we’ll grow as programmers. Okayy?")


}