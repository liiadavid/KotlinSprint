package lesson_11

fun main() {

}

class RecipeCategory(
    val id: Int,
    val cover: String,
    val name: String,
    val description: String,
)

class Recipe(
    val id: Int,
    val cover: String,
    val name: String,
    val ingredients: Ingredient,
    val category: String,
    val isFavorite: Boolean = false,
    val cookingMethod: String,
)

class Ingredient(
    val id: Int,
    val name: String,
    val numberOfIngredients: Int,
    val portions: Int,
)