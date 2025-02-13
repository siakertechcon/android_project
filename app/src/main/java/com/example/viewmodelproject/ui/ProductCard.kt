package com.example.viewmodelproject.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import coil3.compose.AsyncImage
import com.example.viewmodelproject.model.Product

@Composable
fun ProductCard(product: Product) {
    Text(text="Name: ${product.name}")
    Text(text="Price: ${product.price}")
    Text(text="Description: ${product.description}")
    Text(text="Rating: ${product.rating}")
    AsyncImage(
        model = product.imageUrl,
        contentDescription = "Translated description of what the image contains"
    )
}