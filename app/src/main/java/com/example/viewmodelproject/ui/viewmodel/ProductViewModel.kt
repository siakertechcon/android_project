package com.example.viewmodelproject.ui.viewmodel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.viewmodelproject.model.Product
import com.example.viewmodelproject.model.ProductRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch


class ProductViewModel: ViewModel() {
    private val _products = MutableStateFlow<List<Product>>(
        ProductRepository.getProducts().toMutableList()
    )
    val products = _products.asStateFlow()

    fun addProduct() {
        _products.value = _products.value +
            Product (
                id = 10001,
                name = "My New Product",
                price = 2.599F,
                description = "Freshly baked Banana muffin with chocolate chip cookies on top. This is for the people who love to add something extra in their muffins. This is a crowd favorite.",
                imageUrl = "https://image.shutterstock.com/image-photo/homemade-banana-muffins-cinnamon-chocolate-600w-1902548164.jpg",
                rating = 4.0F
            )
        for(product in products.value) {
            Log.d("PVM", product.toString())
        }
    }



//    val products = ProductRepository.getProducts().toMutableList()
//    fun addProduct() {
//        products += Product (
//            id = 10001,
//            name = "Cool new product",
//            price = 2.599F,
//            description = "Freshly baked Banana muffin with chocolate chip cookies on top. This is for the people who love to add something extra in their muffins. This is a crowd favorite.",
//            imageUrl = "https://image.shutterstock.com/image-photo/homemade-banana-muffins-cinnamon-chocolate-600w-1902548164.jpg",
//            rating = 4.0F
//        )
//        for(product in products) {
//            Log.d("PVM", product.toString())
//        }
//    }
//
//    init {
//        Log.d("PVM", "ViewModel Created")
//    }
//
//    override fun onCleared() {
//        Log.d("PVM", "ViewModel Destroyed")
//    }
}