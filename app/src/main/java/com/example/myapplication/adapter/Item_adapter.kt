package com.example.myapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.module.Item

class Item_adapter(var news:MutableList<Item>) :RecyclerView.Adapter<Item_adapter.MyHolder>(){
    class MyHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
    return MyHolder(LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false))
    }

    override fun getItemCount(): Int {
        return news.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
      var index
    }
}