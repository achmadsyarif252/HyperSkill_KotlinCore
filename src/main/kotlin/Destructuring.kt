data class User(val name: String, val age: Int, val isAdmin: Boolean)

val anonym = User("Anonym", 999, false)

fun main() {
//    val (userName, userAge, isAdmin) = anonym
//    println(userName)
//    println(userAge)
//    println(isAdmin)
//
//    val userName2 = anonym.component1()
//    val userAge2 = anonym.component2()
//    val isAdmin2 = anonym.component3()
//
//    processList(mutableListOf("Achmad", "Syarif", "Jakarta"))

//    val usersData = mutableListOf<User>()
//    for ((_, _, isAdmin) in usersData) {
//        // /~
//    }

    printComments(mutableListOf(Comment(1, "Admin", "Test"), Comment(2, "ActiveUser", "Heey")))
}

class User2(val name: String, val age: Int, val isAdmin: Boolean) {
    operator fun component1(): String = name
    operator fun component2(): Int = age
    operator fun component3(): Boolean = isAdmin
}

fun checkIsAdmin(suspiciousUser: User2) {
    //destructuring
    val (name, age, isAdmin) = suspiciousUser
    if (isAdmin) println("Have a nice day!") else println("Sorry, you should not be here.")
}

fun processList(customerInfo: MutableList<String>) {
    if (customerInfo.size < 3) return
    val (firstName, lastName, city) = customerInfo
    println("$firstName $lastName $city")
//    showCustomerName(firstName, lastName)
//    findPopularSellersInCity(city)
}

data class Comment(val id: Int, val body: String, val author: String)

fun printComments(commentsData: MutableList<Comment>) {
    for ((_, body, author) in commentsData) {
        println("Author: $author; Text: $body")
    }
}

//fun processAnalytics(usersData: MutableList<User>) {
//    for ((name, age, isAdmin) in usersData) {
//        if (!isAdmin)
////            sendAnalyticsToCompany(name, age)
////    }
//}

data class Student(val name: String, val age: Int, val isStudent: Boolean)
fun iterateThroughStudentsList(studentData: MutableList<Student>) {
    for ((name, _, isStudent) in studentData) {
        // some code
    }
}

fun iterateThroughStudentsList2(studentData: MutableList<Student>) {
    for ((_, age, isStudent) in studentData) {
        // some code
    }
}

fun iterateThroughStudentsList3(studentData: MutableList<Student>) {
    for ((name, age, ) in studentData) {
        // some code
    }
}

fun iterateThroughStudentsList4(studentData: MutableList<Student>) {
    for ((_, _, _) in studentData) {
        // some code
    }
}