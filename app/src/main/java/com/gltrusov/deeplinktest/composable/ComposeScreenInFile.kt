package com.gltrusov.deeplinktest.composable

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun ComposeScreenInFile() {
    val test = object {}::class.java.`package`?.name ?: "null"
    val funName = object {}::class.java.enclosingMethod?.name ?: "null"

    Text(text = "$test.$funName.kt")
}