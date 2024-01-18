data class Person2(val name: String, val age: Int)

class PersonAgeComparator : Comparator<Person2> {
    override fun compare(p1: Person2, p2: Person2): Int {
        return p1.age - p2.age
    }
}


data class Employee2(val name: String, val age: Int, val salary: Int) : Comparable<Employee2> {
    override fun compareTo(other: Employee2): Int {
        return this.salary - other.salary
    }

}

fun main() {
    val people = listOf(
        Employee2("John", 25, 25000),
        Employee2("Sony", 25, 27000),
        Employee2("AgeUle", 25, 26000),
        Employee2("Dior", 25, 23000),

        )

    val comparator = Comparator<Employee2> { p1, p2 -> p1.age - p2.age }
    val sortedPeople = people.sortedWith(comparator)

    sortedPeople.forEach { println("${it.name}, ${it.age}") }
}