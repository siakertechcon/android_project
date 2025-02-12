package com.example.composableproject.composable

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun TextButton(text: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
    ) {
        Text(text = text)
    }
}