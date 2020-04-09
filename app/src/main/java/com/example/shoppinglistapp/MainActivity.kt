package com.example.shoppinglistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shoppinglistapp.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var appList: ArrayList<Shop>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        appList = ArrayList()
        addApp()

        appRecycler.layoutManager = LinearLayoutManager(this)
        appRecycler.addItemDecoration(DividerItemDecoration(this,1))
        appRecycler.adapter = ShopAdapter(appList)
    }

    fun addApp(){
        appList.add(Shop("Food Item", "List of food items to buy", R.drawable.food))
        appList.add(Shop("Fruits & Vegetables", "List of fruits and vegetables to buy", R.drawable.fruits))
        appList.add(Shop("Meat, Fish & Poultry", "List of meat, fish & poultry to buy", R.drawable.meat))
        appList.add(Shop("Drinks & Beverages", "List of drinks and beverages to buy", R.drawable.drink))
        appList.add(Shop("Health & Personal care", "List of health & personal care items to buy", R.drawable.health))
        appList.add(Shop("Grocery", "List of groceries to buy", R.drawable.others))
        appList.add(Shop("Bakery", "List of Bread and pastries to buy", R.drawable.bakery))
        appList.add(Shop("Cleaning", "List of cleaning supplies to buy", R.drawable.cleaning))
        appList.add(Shop("Pets", "List of pets products to buy", R.drawable.pet))
    }
}
