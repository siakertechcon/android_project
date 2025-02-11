package com.example.androidproject.ui.product_list

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidproject.R
import com.example.androidproject.ui.main.MainActivity
import com.example.androidproject.model.product.ProductRepository
import com.example.androidproject.ui.product_list.recycler.ProductAdapter

class ProductListActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_list)
        val backButton: Button = findViewById(R.id.back_button)
        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val dataset = ProductRepository.getProducts()
        val productAdapter = ProductAdapter(dataset, this)
        val productRecyclerView: RecyclerView = findViewById(R.id.product_recycler_view)
        productRecyclerView.layoutManager = LinearLayoutManager(this)
        productRecyclerView.adapter = productAdapter
    }
}