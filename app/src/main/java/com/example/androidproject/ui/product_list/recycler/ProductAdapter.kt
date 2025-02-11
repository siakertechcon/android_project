package com.example.androidproject.ui.product_list.recycler

import android.app.Activity
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.androidproject.model.product.Product
import com.example.androidproject.R

class ProductAdapter(
    private val products: List<Product>,
    private val activity: Activity
): RecyclerView.Adapter<ProductHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_product, parent, false)
        return ProductHolder(view)
    }

    override fun getItemCount() = products.size

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        val product = products[position]
        holder.name.text = product.name
        holder.description.text = product.description
        Glide.with(holder.itemView).load(product.imageUrl).into(holder.image)
        holder.itemView.setOnClickListener {
            Toast.makeText(
                activity,
                "price: ${product.price}, rating: ${product.rating}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}