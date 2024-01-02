fun main() {
    val urls = listOf(
        "htTpS://hypeRskIll.org",
        "HTTPS://www.jetbrains.com",
        "https://github.com"
    )

    println(urls.size)

    val mappedUrls = urls.map { it.lowercase() }
        .associate { url ->
            url.removePrefix("https://").removeSuffix("/") to url.length
        }

    println(mappedUrls)
}