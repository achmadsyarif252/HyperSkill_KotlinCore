//interface AnimalExtends {
//    val numberOfLimbs: Int
//    fun move()
//    fun communicate()
//}
//
//interface BirdExtends : AnimalExtends {
//    val canFly: Boolean
//    fun buildNest()
//}
//
//interface Flying {
//    val flyingSpeed: Int
//    val flyingManeuverability: Int
//}
//
//class ParrotExtends : BirdExtends, Flying {
//    override val flyingManeuverability: Int
//        get() = 95
//    override val numberOfLimbs: Int
//        get() = 2
//    override val canFly: Boolean
//        get() = true
//    override val flyingSpeed: Int
//        get() = 20
//
//    override fun move() {
//        fly()
//    }
//
//    override fun communicate() {
//        speak()
//    }
//
//    override fun buildNest() {
//        collectionMaterials()
//        findGoodPlace()
//        buildSmallNest()
//    }
//}
//
//interface Insect:Flying{
//
//}
//
//class Fly:Insect,AnimalExtends{
//
//}