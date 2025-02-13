package com.example.viewmodelproject.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.viewmodelproject.model.Product
import com.example.viewmodelproject.model.ProductRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch


object ProductViewModel: ViewModel() {
    private val _productData = MutableStateFlow(
        ProductRepository.getProducts()
    )
    val productData = _productData.asStateFlow()

    fun addProduct() {
        _productData.update { productList ->
            productList + Product(0, "New Product", 23.32F, "asdadadad", "https://image.shutterstock.com/image-photo/homemade-banana-muffins-cinnamon-chocolate-600w-1902548164.jpg", 4.3F)
        }
    }
}