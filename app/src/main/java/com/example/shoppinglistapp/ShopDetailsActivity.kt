package com.example.shoppinglistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.shoppinglistapp.databinding.ActivityShopDetailsBinding
import kotlinx.android.synthetic.main.activity_shop_details.*

class ShopDetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityShopDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_shop_details)

        appName.text = getIntent().getStringExtra("appName")
        appDescription.text = getIntent().getStringExtra("appDesc")
        appImage.setImageResource(getIntent().getStringExtra("appLogo").toInt())
    }
}
