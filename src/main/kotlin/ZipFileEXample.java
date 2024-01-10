import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

//public class ZipFileEXample {
//    public static void main(String[] args) {
//        try (ZipFile zipFile = new ZipFile("basedir.zip")) {
//            Enumeration<? extends ZipEntry> entries = zipFile.entries();
//
//            while (entries.hasMoreElements()) {
//                ZipEntry entry = entries.nextElement();
//                System.out.println("Entry Name : " + entry.getName());
//            }
//
//        } catch (IOException e) {
//            System.out.println("Error opening ZIP file: " + e.getMessage());
//        }
//    }
//}
