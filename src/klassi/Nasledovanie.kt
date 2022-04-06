interface Roamable{
    fun roam()
}

abstract class Animals:Roamable{

    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger = 10

    abstract fun makeNoise()

    abstract fun eat()

    override fun roam() {
        println("The Animal is roaming")
    }

    fun sleep() {
        println("The Animal is sleeping")
    }

}

class Hippo : Animals() {
    final override val image: String = "hippo.jpg"
    final override val food: String = "grass"
    final override val habitat: String = "water"

    final override fun makeNoise() {
        println("Grunt! Grunt")
    }

    final override fun eat() {
        println("The Hippo is eating $food")
    }
}

abstract class Canine : Animals() {
    override fun roam() {
        println("The Canine is roaming")
    }
}

class Wolf : Canine() {
    override val image: String = ""
    override val food: String = ""
    override val habitat: String = ""

    override fun makeNoise() {
        println("Hooooowl!")
    }

    override fun eat() {
        println("The Wolf is eating $food")
    }
}

class Vehicle :Roamable{
    override fun roam() {
        println("The Vehicle is roaming")
    }
}

class Vet {
    fun giveShot(animal: Animals) {
        animal.makeNoise()
    }
}

fun main() {
    val animal = arrayOf(Hippo(), Wolf())
    for (item in animal) {
        item.roam()
        item.eat()
    }
    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)

    val roamable = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roamable) {
        item.roam()
        if (item is Animals) {
            item.eat()
        }
    }
}

