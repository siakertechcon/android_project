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
import com.example.viewmodelproject.model.Product
import com.example.viewmodelproject.model.ProductRepository
import com.example.viewmodelproject.ui.ProductCard
import com.example.viewmodelproject.ui.viewmodel.ProductViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen() {
    val productViewModel = ProductViewModel()
    val productState = productViewModel.productData.collectAsState()
    val products = productState.value
    Scaffold {
        Column {
            Button(
                onClick = {
                    productViewModel.addProduct()
                }
            ) {
                Text("Press Me")
            }
            LazyColumn {
                items(products) { product ->
                    ProductCard(product)
                }
            }
        }
    }
}