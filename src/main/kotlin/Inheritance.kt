open class Employeee(val name: String, val age: Int, var yearsOfWork: Int = 0)

class Programmer : Employeee {
    constructor(name: String, age: Int) : this(name, age, 0)
    constructor(name: String, age: Int, yearsOfWork: Int) : super(name, age, yearsOfWork)
}