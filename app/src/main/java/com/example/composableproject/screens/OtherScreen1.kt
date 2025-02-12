package com.example.composableproject.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.composableproject.composable.TextButton


@Composable
fun OtherScreen1(navigate: (String) -> Unit) {
    Column {
        Text(text="Screen1")
        TextButton(text="Home") {
            navigate("Home")
        }
        TextButton(text="Screen2") {
            navigate("Screen2")
        }
        TextButton(text="Screen3") {
            navigate("Screen3")
        }
    }
}