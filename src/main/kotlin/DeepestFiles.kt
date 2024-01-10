import java.util.zip.ZipEntry
import java.util.zip.ZipFile

fun main() {
    val rarFilename = "src/file.rar"
    val deepestFile = findDeepestFile(rarFilename)
    println(deepestFile)
}

fun findDeepestFile(rarFilename: String): String {
    val rarFile = ZipFile(rarFilename)
    var deepestFile = ""
    var maxDepth = 0

    val entries = rarFile.entries()
    while (entries.hasMoreElements()) {
        val entry = entries.nextElement()
        val depth = entry.name.count { it == '/' }

        if (depth > maxDepth) {
            maxDepth = depth
            deepestFile = entry.name
        }
    }

    return deepestFile
}