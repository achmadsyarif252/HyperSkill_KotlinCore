fun main() {
    val domains = "htTpS://hypeRskIll.org HTTPS://www.jetbrains.com https://github.com".split(" ")
    val map = with(domains) {
        println(this.size)
        var map = mutableMapOf<String, String>()
        domains.forEach {
            map += mapOf<String, String>(it.lowercase() to "[${it.length}]")
        }
        map
    }
    println(map)
}