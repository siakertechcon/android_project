package com.example.viewmodelproject.ui.viewmodel

import com.example.viewmodelproject.model.Product
import com.example.viewmodelproject.model.ProductRepository

object ProductViewModel {
    fun get(): List<Product> {
        return ProductRepository.getProducts()
    }
}