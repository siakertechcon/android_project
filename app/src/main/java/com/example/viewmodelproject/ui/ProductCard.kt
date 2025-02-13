package com.example.viewmodelproject.ui

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import coil3.compose.AsyncImage
import com.example.viewmodelproject.model.Product

@Composable
fun ProductCard(product: Product) {
    val context = LocalContext.current
    Box(
        Modifier.clickable(
        onClick = {
            Toast.makeText(
                context,
                "Rating: ${product.rating}, Price: ${product.price}",
                Toast.LENGTH_SHORT
            ).show()
        }
    )) {
        Text(text="Name: ${product.name}")
        Text(text="Description: ${product.description}")
        AsyncImage(
            model = product.imageUrl,
            contentDescription = "Translated description of what the image contains"
        )
    }
}