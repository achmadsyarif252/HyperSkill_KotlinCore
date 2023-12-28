class Superhero {
    val power = 1000

    class MagicCloak {
        // you cannot access something from Superhero here
        val magicPower = 100

        companion object{
            val magicPower =100
        }
    }
    // you need to create a MagicCloak object to access its members
    val magicPower = power * MagicCloak().magicPower
    //gunakan namaClass().nama properti untuk mengakses properti sebuah class
    //gunakan NamaClass.namaVariabel untuk mengakses variabel di dalam companion object

    class Hammer {
        // you cannot access power property from Superhero here
        val mightPower = 100
    }
    val mightPower = power * Hammer().mightPower
}