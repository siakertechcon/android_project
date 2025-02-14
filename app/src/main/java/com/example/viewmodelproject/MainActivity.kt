package com.example.viewmodelproject

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.viewmodelproject.ui.screens.HomeScreen
import com.example.viewmodelproject.ui.viewmodel.ProductViewModel
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    private val productViewModel: ProductViewModel by viewModels()
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "StateFlowValueCalledInComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("PVM", "Activity Created, here is PVM: $productViewModel")
        setContent {
            HomeScreen(productViewModel)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("PVM", "Activity Destroyed")
    }
}
