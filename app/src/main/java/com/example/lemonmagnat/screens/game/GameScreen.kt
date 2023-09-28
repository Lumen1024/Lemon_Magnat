package com.example.lemonmagnat.screens.game

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun InventoryBar()
{

}

@Composable
fun StorageView()
{

}

@Composable
fun GameScreen() {
    Column {
        InventoryBar()
        Text(text = "0$")
        StorageView()
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Select")
        }
    }
}