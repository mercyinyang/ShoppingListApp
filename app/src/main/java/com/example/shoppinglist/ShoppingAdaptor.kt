package com.example.shoppinglist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppingname.Shopping
import kotlinx.android.synthetic.main.layout_item_view.view.*

class ShoppingAdaptor(var items : ArrayList<Shopping>) : RecyclerView.Adapter<ShoppingViewHolder>(){
    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoppingViewHolder {
        lateinit var shoppingViewHolder: shoppingViewHolder
        shoppingViewHolder = shoppingViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_item_view,parent,false))
        return shoppingViewHolder
    }

    override fun onBindViewHolder(holder: ShoppingViewHolder, position: Int) {
        holder.shoppingname?.text = items.get(position).name
        holder.shoppingdescription?.text = items.get(position).description
        holder.shoppinglogo.setImageResource(items.get(position).logo)

    }
}
class shoppingViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var shoppingName = itemView.shoppingname
    var shoppingDescription = itemView.shoppingdescription
    var shoppingLogo = itemView.shoppinglogo
}