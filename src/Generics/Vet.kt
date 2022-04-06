package Generics

class Vet<T : Pet> {
    fun treat(t: T) {
        println("Treat pet ${t.name}")
    }
}