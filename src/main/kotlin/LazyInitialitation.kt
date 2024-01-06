/*
* variabel dibuat hanya pada saat dimana dibutuhkan pertama kali
* beda dengan val nama = "achmad syarif" dia akan langsung adad di memori
* pada saat class tersebut berjalan
*
* beda dengan lateinit,lateinit itu keyword yang dipakai
* jika kita ingin membuat sebuah variabel yang belum kita tentukan nilainya
* tapi kita tidak mau dia itu nullable (boleh diisi dengan null)
* */


class LazyInitialitation {
    lateinit var a: String
    fun initA(a: String) {
        this.a = a
    }

    fun doSmth() {
        if (::a.isInitialized) {
            println("a is Initialized")
        } else {
            println("a isn't Initialized")
        }
    }
}

fun main() {

    val a: String by lazy {
        print("Variable a is initialized. ")
        "I love Hyperskill!"
    }

    println("Initializing a!")
    println(a)
    println(a)

    val lazyInitialitation = LazyInitialitation()
//    println(lazyInitialitation.a)
    lazyInitialitation.initA("Hallo")
    lazyInitialitation.doSmth()
    println(lazyInitialitation.a)

    val lazyCat = LazyCat()
    println(lazyCat.name)

}

class LazyCat {
    val name by lazy {
        println("I prefer to ignore it")
        callName()
    }

    fun callName() = println("Input the cat name").run {
        readln().toString()
    }
}
