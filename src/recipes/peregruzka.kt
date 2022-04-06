
//klass dannix

package recipes

data class Recipe(val title: String,
                  val  mainIngredient: String="",
                  val isVegetarian: Boolean=false,
                  val difficulty: String = "Easy")

class Mushrow(val size: Int, val isMagic: Boolean){
    constructor(isMagic_param: Boolean):this(0,isMagic_param){
        //Код, выполняемый при вызове вторичного конструктора
    }
}
fun findRecipes(title: String = "",
                ingredient: String = "",
                isVegetarian: Boolean = false,
                difficulty: String = "") : Array<Recipe> {
//Код поиска рецептов
    return arrayOf(Recipe(title, ingredient, isVegetarian, difficulty))
}
fun addNumbers(a: Int, b: Int) : Int {
    return a + b
}
fun addNumbers(a: Double, b: Double) : Double {
    var s:String?="privet"
    s= null

    return a + b
}



fun main() {

    val r1 = Recipe("Thai Curry","Chiken")
    val r2 = Recipe(title="Thai Curry", mainIngredient = "Chiken")
    val r3 = r1.copy(title = "Chiken Bhuna")
    println("r1 hash code: ${r1.hashCode()}")
    println("r2 hash code: ${r2.hashCode()}")
    println("r3 hash code: ${r3.hashCode()}")

    println("r1 toString: ${r1.toString()}")
    println("r1==r2? ${r1 == r2}")
    println("r1===r2? ${r1 === r2}")
    println("r1==r3? ${r1 == r3}")
    val (title, mainIngredient,vegetarian,difficulty) = r1
    println("title is $title and vegetarian is $vegetarian")

    val m1 = Mushrow(6, false)
    println("m1 size is ${m1.size} and isMagic is ${m1.isMagic}")
    val m2 = Mushrow(true)

    println("m2 size is ${m2.size} and isMagic is ${m2.isMagic}")
    println(addNumbers(2, 5))
    println(addNumbers(1.6, 4.3))

//    val array = arrayOf("Hi", "Hello", null) //let operator
//    for (item in array) {
//        item?.let {
//            println(it)
//        }
//    }

//    w?.hunger ?: -1 //elvis operator igivea rac qveda
//    if (w?.hunger != null) w.hunger else -1



}

