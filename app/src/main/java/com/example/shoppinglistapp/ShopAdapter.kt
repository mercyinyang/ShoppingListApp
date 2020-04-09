package com.example.shoppinglistapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_item_view.view.*

class ShopAdapter(var items: ArrayList<Shop>) : RecyclerView.Adapter<ShopViewHolder>(){
    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopViewHolder {
        lateinit var shopViewHolder: ShopViewHolder
        shopViewHolder = ShopViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_item_view,parent,false))
        return shopViewHolder
    }

    override fun onBindViewHolder(holder: ShopViewHolder, position: Int) {
        holder.appName?.text = items.get(position).name
        holder.appName?.text = items.get(position).description
        holder.appLogo.setImageResource(items.get(position).logo)
    }

}

class ShopViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
    var appName = itemView.appName
    var appDescription = itemView.appDescription
    var appLogo = itemView.appLogo
}