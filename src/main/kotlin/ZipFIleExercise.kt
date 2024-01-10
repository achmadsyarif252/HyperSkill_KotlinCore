import java.io.BufferedReader
import java.io.FileNotFoundException
import java.io.InputStreamReader
import java.util.zip.ZipFile

fun printTextFileContent(zipFilePath: String, fileName: String) {
    var line: String
    try {
        ZipFile(zipFilePath).use { zip ->
            val entry = zip.getEntry(fileName) ?: throw FileNotFoundException()
            zip.getInputStream(entry).use { input ->
                BufferedReader(InputStreamReader(input)).use { reader ->
                    while (reader.readLine().also { line = it } != null) {
                        println(line)
                    }
                }
            }
        }

    } catch (e: Exception) {
        e.printStackTrace()
    }

}

fun main() {
    printTextFileContent("src/basedir.zip", "2kh0SXhn1H")
}