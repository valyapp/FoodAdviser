package com.hfad.foodadviser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class FindFoodOptionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_food)
    }

    fun onClickGetFoodOptions(view: View) { //метод который будет вызываться при клике по кнопке "Показать вариенты"

        var expert = FoodExpert();

        var meal: Spinner = findViewById(R.id.spinner) //находим выпадающий список
        var foodOptions: TextView = findViewById(R.id.textView) //находим текст
        var mealType: String = meal.selectedItem.toString() //находим что выбрано в выпадающем списке


        foodOptions.setText(expert.getMeals(mealType).toString())

    }
}