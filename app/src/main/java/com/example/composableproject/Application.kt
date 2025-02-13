package com.example.composableproject

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composableproject.screens.HomeScreen
import com.example.composableproject.screens.OtherScreen1
import com.example.composableproject.screens.OtherScreen2
import com.example.composableproject.screens.OtherScreen3

@SuppressLint("NotConstructor", "UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Application() {
    val navController = rememberNavController()
    val navigate: (String) -> Unit = { destination ->
        navController.navigate(destination)
    }
    NavHost(
        navController = navController,
        startDestination = "Home"
    ) {
        composable(route = "Home") {
            HomeScreen(navigate)
        }
        composable(route = "Screen1") {
            OtherScreen1(navigate)
        }
        composable(route = "Screen2") {
            OtherScreen2(navigate)
        }
        composable(route = "Screen3") {
            OtherScreen3(navigate)
        }
    }
}