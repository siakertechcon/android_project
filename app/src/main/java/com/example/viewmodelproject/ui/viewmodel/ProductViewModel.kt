package com.example.viewmodelproject.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.viewmodelproject.model.Product
import com.example.viewmodelproject.model.ProductRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async


object ProductViewModel: ViewModel() {
    suspend fun get(): List<Product> {
        val products = viewModelScope.async {
            ProductRepository.getProducts()
        }
        return products.await()
    }
}