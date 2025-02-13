package com.example.viewmodelproject

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import coil3.compose.AsyncImage
import com.example.viewmodelproject.model.Product
import com.example.viewmodelproject.model.ProductRepository
import com.example.viewmodelproject.ui.theme.ViewModelProjectTheme
import com.example.viewmodelproject.ui.viewmodel.ProductViewModel

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold {
                Column {
                    LazyColumn {
                        items(ProductViewModel.get()) { product ->
                            ProductView(product)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ProductView(product: Product) {
    Text(text="Name: ${product.name}")
    Text(text="Price: ${product.price}")
    Text(text="Description: ${product.description}")
    Text(text="Rating: ${product.rating}")
    AsyncImage(
        model = product.imageUrl,
        contentDescription = "Translated description of what the image contains"
    )
}
