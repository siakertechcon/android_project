package com.example.viewmodelproject.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.viewmodelproject.model.Product
import com.example.viewmodelproject.model.ProductRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow


class ProductViewModel: ViewModel() {
    private val _products = MutableStateFlow(
        ProductRepository.getProducts()
    )
    val products = _products.asStateFlow()

    fun addProduct() {
        _products.value += Product(
            id = 10001,
            name = "My New Product",
            price = 2.599F,
            description = "Freshly baked Banana muffin with chocolate chip cookies on top. This is for the people who love to add something extra in their muffins. This is a crowd favorite.",
            imageUrl = "https://image.shutterstock.com/image-photo/homemade-banana-muffins-cinnamon-chocolate-600w-1902548164.jpg",
            rating = 4.0F
        )
    }
}