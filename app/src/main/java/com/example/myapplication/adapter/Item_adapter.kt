package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.module.Item

class Item_adapter(var news: MutableList<Item>, var itemClick: ItemClick) : RecyclerView.Adapter<Item_adapter.MyHolder>() {
    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var data = itemView.findViewById<TextView>(R.id.item_date)
        var name = itemView.findViewById<TextView>(R.id.item_name)
        var img = itemView.findViewById<ImageView>(R.id.item_img)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return MyHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))
    }

    override fun getItemCount(): Int {
        return news.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        var index = news[position]
        holder.data.text = index.data
        holder.name.text = index.name
        holder.img.setImageResource(index.image)

        holder.itemView.setOnClickListener {
            itemClick.onItemClick(index)
        }
    }


    interface ItemClick {
        fun onItemClick(item: Item)
    }
}