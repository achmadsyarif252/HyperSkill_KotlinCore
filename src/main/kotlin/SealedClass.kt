import java.util.Objects

//sealed class CustomError {
//
//    constructor(type: String) {} // protected (default)
//    private constructor(type: String, code: Int) {} // private
//    public constructor() {} //  Public gives error
//}

sealed class CustomError(type: String)
enum class Staff(numberOfLessons: Int) {
//    TEACHER(2), MANAGER("Manager is managing")
}

sealed class Staff2 {
    class Teacher(val nummberOfLessons: Int) : Staff2()
    class Manager(val Responsibility: String) : Staff2()
    object Worker : Staff2()
}

open class SealedClassPerson {
    fun whoAmI(name: String): String {
        return "I am $name"
    }
}

sealed class StaffSealed : SealedClassPerson() {
    class Teacher(val numberOfLessons: Int) : StaffSealed()
    class Manager(val Responsibility: String) : StaffSealed()
    object Worker : StaffSealed()
}

fun main() {
//    val worker = StaffSealed.Worker
//    println(worker.whoAmI("Worker"))

    val teacher = StaffSealed.Teacher(3)
    val worker = StaffSealed.Worker
    listTheTasks(teacher)
    listTheTasks(worker)

    val a = 100
    with(a) {
        println(it)
    }
}

fun listTheTasks(staff: StaffSealed) = when (staff) {
    is StaffSealed.Teacher -> println("The teacher has ${staff.numberOfLessons} lessons today")
    is StaffSealed.Manager -> println("The manager is doing ${staff.Responsibility} today")
    StaffSealed.Worker -> println("Worker is fixing the projector for profs in CS, all respect to him.")
}

sealed class Color {
    sealed class CustomColor(val hex: String)
}


//sealed class MySealedClass {
//    val data:String = ""
//
//    constructor(data:String) {}
//}


sealed class MySealedClass(val data: String)