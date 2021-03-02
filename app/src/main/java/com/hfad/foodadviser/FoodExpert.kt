package com.hfad.foodadviser

class FoodExpert() {

    fun getMeals(meal: String): ArrayList<String> {

        var meals: ArrayList<String> = ArrayList()

        if (meal == "Завтрак") {
            meals.add("Омлет")
            meals.add("Салат с фасолью")
        } else if (meal == "Обед") {
            meals.add("Суп куриный")
            meals.add("Пельмени")

        } else {
            meals.add("Рыба с овощами")

        }

        return meals
    }

}