fun greetUser(
    name: String,
    admin: Boolean = false,
    smith: Boolean = false,
    honorific: String = "",
    greet: String = "Greetings"
): String {
    return if (!admin && !smith) {
        "$greet, $honorific $name"
    } else {
        "Matrix Error"
    }
}
// do not change lines above        

fun greetNeo() = greetUser(name = "Anderson", honorific = "Mr.", greet = "Hello")

class City(val name: String) {
    var population: Int = 0
        set(value) {
            if (value < 0) field = 0
            else if (value > 50_000_000) field = 50_000_000
            else field = value
        }
    // set(value){
    // field = value.coerceIn(0,50_000_000) //return this if in the range,minimum if less,max if above
    //}
}

fun main() {
    val p = City("Manchester")
    p.population = 500000000;
    println(p.population)
}

