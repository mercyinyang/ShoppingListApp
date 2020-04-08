package com.example.shoppinglist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shoppinglist.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var shoppinglist: ArrayList<Shopping>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        shoppinglist = ArrayList()
        addShopping()

        shoppingRecycler.layoutManager = LinearLayoutManager(this)
        shoppingRecycler.addItemDecoration(DividerItemDecoration(this,1))
        shoppingRecycler.adapter = ShoppingAdaptor(shoppinglist)
    }
    fun addShopping(){
        shoppinglist.add(Shopping("Food Item", "List of food items to buy", R.drawable.food))
        shoppinglist.add(Shopping("Fruits & Vegetables", "List of fruits and vegetables to buy", R.drawable.fruits))
        shoppinglist.add(Shopping("Meat, Fish & Poultry", "List of meat, fish & poultry to buy", R.drawable.meat))
        shoppinglist.add(Shopping("Drinks & Beverages", "List of drinks and beverages to buy", R.drawable.drink))
        shoppinglist.add(Shopping("Health & Personal care", "List of health & personal care items to buy", R.drawable.health))
        shoppinglist.add(Shopping("Grocery", "List of groceries to buy", R.drawable.others))
        shoppinglist.add(Shopping("Bakery", "List of Bread and pastries to buy", R.drawable.bakery))
        shoppinglist.add(Shopping("Cleaning", "List of cleaning supplies to buy", R.drawable.cleaning))
        shoppinglist.add(Shopping("Pets", "List of pets products to buy", R.drawable.pet))
    }
}

