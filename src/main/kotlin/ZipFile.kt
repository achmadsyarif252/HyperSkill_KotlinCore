import java.io.BufferedOutputStream
import java.io.FileOutputStream
import java.util.Enumeration
import java.util.zip.ZipEntry
import java.util.zip.ZipFile


fun main() {
    val zipFilePath = "src/basedir.zip"
    openZipFile(zipFilePath)
}

fun openZipFile(filePath: String) {
    val zipFile = ZipFile(filePath)
    val entries: Enumeration<*> = zipFile.entries()

    while (entries.hasMoreElements()) {
        val entry = entries.nextElement() as ZipEntry
        //process the entry
        println("Entry name : ${entry.name}")
    }
    zipFile.close()
}

fun cek() {
    ZipFile("example.zip").use { zip ->
        zip.entries().asSequence().forEach { entry ->
            BufferedOutputStream(FileOutputStream(entry.name)).use { output ->
                zip.getInputStream(entry).use { input ->
                    input.copyTo(output)
                }
            }

        }
    }

    try {

    } catch (e: Exception) {
        println()
    }
}

fun cek2() {
    ZipFile("example.zip").use { zip ->
        zip.entries().asSequence().forEach { entry ->
            zip.getInputStream(entry).use { input ->
                BufferedOutputStream(FileOutputStream(entry.name)).use { output ->
                    input.copyTo(output)
                }
            }
        }
    }
}