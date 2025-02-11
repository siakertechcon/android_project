package com.example.androidproject.ui.product_list.recycler

import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidproject.R

class ProductHolder(view: View): RecyclerView.ViewHolder(view) {
    val name: TextView
    val description: TextView
    val image: ImageView
    init {
        name = view.findViewById(R.id.name)
        description = view.findViewById(R.id.description)
        image = view.findViewById(R.id.image)
    }
}