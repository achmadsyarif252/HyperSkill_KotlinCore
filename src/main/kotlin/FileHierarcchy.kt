import java.io.File
import java.nio.file.Paths
import kotlin.io.path.*

@OptIn(ExperimentalPathApi::class)
fun main() {
//    val outDir = File("sourceDir")
//    println(outDir.exists())
//    outDir.mkdir()
//    println(outDir.exists())
//    println(outDir.isDirectory)
//
//    val destDir = File("destDir")
//    destDir.mkdir()
//
//    val file = outDir.resolve("file.txt")
//    println(file.exists())
//    file.createNewFile()
//    println(file.exists())
//    println(file.isFile)

//    val sourcePath = Path("sourceDir/file.txt")
//    val destinationPath = Path("destDir/file.txt")
//
//    //list all files in the 'sourceDir' directory
//    val filesInDir = Path("sourceDir").listDirectoryEntries()
//    println("Files in sourceDir : $filesInDir")
//
//    //copy the file from 'sourceDir' to 'destDir'
//    sourcePath.copyTo(destinationPath, overwrite = true)
//    println("File copied from sourceDir to destDir")
//
//    //move the file within destDir to a new file
//    val movedPath = destinationPath.moveTo(Paths.get("destDir/movedFile.txt"), overwrite = true)
//    println("File moved to : $movedPath")
//
//    //write text to the moved file
//    movedPath.writeText("Hello, world!")
//    println("Text written to file.")
//
//    //Read the text from the file
//    val text = movedPath.readText()
//    println("Text read from file: $text")
//
//    //read the lines from the file as a collection
//    val lines = movedPath.readLines()
//    println("Lines read from file : $lines")

    //walk all files and directories within 'destDir'
    val walkedPaths = File("src/basedir2").walkTopDown()
    walkedPaths.forEach {
        if (it.isDirectory) {
            val list = it.list()
            println(list.joinToString(" "))
//            if (list.isEmpty()) println(it)
        }
    }
//    println("Walked paths : ${walkedPaths}")

//    //copy 'sourceDir' to 'copyDir' recursively
//    Path("sourceDir").copyToRecursively(
//        target = Paths.get("copyDir"),
//        overwrite = true,
//        followLinks = true
//    )
//    println("Directory copied recursively")

}