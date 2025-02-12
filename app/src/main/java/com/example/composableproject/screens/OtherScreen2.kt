package com.example.composableproject.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.composableproject.composable.TextButton


@Composable
fun OtherScreen2(navigate: (String) -> Unit) {
    Column {
        Text(text="Screen2")
        TextButton(text="Screen1") {
            navigate("Screen1")
        }
        TextButton(text="Home") {
            navigate("Home")
        }
        TextButton(text="Screen3") {
            navigate("Screen3")
        }
    }
}