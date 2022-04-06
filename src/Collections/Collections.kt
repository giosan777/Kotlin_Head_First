package Collections

import recipes.Recipe

fun main() {
    ////  LIST
    println("//////////////////// SET")
    var mShoppingList = mutableListOf("Tea", "Egges", "Tea")
    println("mShoppingList original: $mShoppingList")

    val extraShopping = listOf("Cookies", "Sugar", "Egges")
    mShoppingList.addAll(extraShopping)
    println("mShoppingList items added $mShoppingList")

    if (mShoppingList.contains("Tea")) {
        mShoppingList.set(mShoppingList.indexOf("Tea"), "Coffee")
    }

    mShoppingList.sort()
    println("mShoppingList sorted: $mShoppingList")
    mShoppingList.reverse()
    println("mShoppingList reversed: $mShoppingList")

    // SET
    println("//////////////////// SET")
    val mShoppingSet=mShoppingList.toMutableSet()
    println("mShopping=setOf: $mShoppingSet")
    val moreShopping = setOf("Chives", "Spinach", "Milk")
    mShoppingSet.addAll(moreShopping)
    println("mShoppingSet items added: $mShoppingSet")
    mShoppingList=mShoppingSet.toMutableList()
    println("mShoppingList new version: $mShoppingList")

    //// MAP
    println("//////////////////// MAP")

    val r1=Recipe("Chiken Soup")
    val r2=Recipe("Quinoa Salad")
    val r3=Recipe("Thai Curry")
    val r4=Recipe("Jambalaya")
    val r5=Recipe("Sausage Rolls")

    val mRecipeMap = mutableMapOf("Recipe1" to r1, "Recipe2" to r2, "Recipe3" to r3)
    println("mRecipeMap original: $mRecipeMap")
    val recipesToAdd = mapOf("Recipe4" to r4, "Recipe5" to r5)
    mRecipeMap.putAll(recipesToAdd)
    println("mRecipeMap updated: $mRecipeMap")
    if (mRecipeMap.containsKey("Recipe1")) {
        println("Recipe is ${mRecipeMap.getValue("Recipe1")}")
    }
}

