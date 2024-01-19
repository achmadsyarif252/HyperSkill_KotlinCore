import kotlin.collections.Iterator

fun main() {
    val alphabet = listOf("a", "b", "c", "d", "e")
    val alphabetIterator = alphabet.iterator()
    while (alphabetIterator.hasNext()) {
        print(alphabetIterator.next() + " ")
    }

    val colors = mutableListOf("red", "green", "blue", "white")
    val mutableIterator = colors.listIterator()

    mutableIterator.next()
    mutableIterator.remove()
    println("After :$colors")
    mutableIterator.add("black")
    println("After : $colors")

    var messageBox = MessageBox(Message("hello!"))
    messageBox.add(Message("I am from hyperskill"))
    messageBox.add(Message("which programming language do you study?"))

    val messageIterator = messageBox.iterator()
    while (messageIterator.hasNext()) {
        println(messageIterator.next().text)
    }

    val map = mapOf(
        "NG" to "Nigeria",
        "AU" to "Australia",
        "CA" to "Canada",
        "BG" to "Bulgaria",
        "DE" to "Germany"
    )
    val mapIterator = map.iterator()
    val input = readln().uppercase()
    // put your code here
    while (mapIterator.hasNext()) {
        val next = mapIterator.next()
        if (next.key == input) println(next.value)
    }

    val words: List<String> = readln().split(" ")
    words.forEach {
        if (it.first() != words[0].first()) return
    }
    println(words.joinToString(" "))
}

fun findLongestByIterator(strIterator: Iterator<String>): String {
    var max = strIterator.next()
    strIterator.forEach {
        if (it.length > max.length) max = it
    }
    return max
}

class Message(var text: String, var next: Message? = null) {}
class MessageBox(var head: Message, var tail: Message = head) : Iterable<Message> {
    init {
        if (tail != head) {
            head.next = tail
        }
    }

    fun add(newMessage: Message) {
        tail.next = newMessage
        tail = newMessage
    }

    override fun iterator(): Iterator<Message> {
        return MessageBoxIterator(this)
    }
}

class MessageBoxIterator(messageBox: MessageBox) : Iterator<Message> {

    private var current: Message = Message("EMPTY_PRE_HEAD", next = messageBox.head)

    override fun hasNext(): Boolean {
        return current.next != null
    }

    override fun next(): Message {
        if (current.next == null) throw NoSuchElementException()

        current = current.next!!
        return current
    }
}
