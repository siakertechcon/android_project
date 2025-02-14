package com.example.viewmodelproject.ui.screens

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import com.example.viewmodelproject.model.Product
import com.example.viewmodelproject.model.ProductRepository
import com.example.viewmodelproject.ui.ProductCard
import com.example.viewmodelproject.ui.viewmodel.ProductViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(productViewModel: ProductViewModel) {
    val products = productViewModel.products.collectAsState()

    Scaffold {
        Column {
            Button(
                onClick = {
                    Log.d("PVM", "AddProduct Pressed")
                    productViewModel.addProduct()
                }
            ) {
                Text("Press Me")
            }
            LazyColumn {
                items(products.value) { product ->
                    ProductCard(product)
                }
            }
        }
    }
}