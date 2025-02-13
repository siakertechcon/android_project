package com.example.viewmodelproject.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.example.viewmodelproject.ui.ProductCard
import com.example.viewmodelproject.ui.viewmodel.ProductViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen() {
    Scaffold {
        LazyColumn {
            items(ProductViewModel.get()) { product ->
                ProductCard(product)
            }
        }
    }
}