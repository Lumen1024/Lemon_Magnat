package com.example.lemonmagnat.screens.records

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun RecordItem() {

}

@Composable
fun RecordsScreen() {
    Column {
        Text(text = "Records")
        LazyColumn()
        {

        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Back")
        }
    }
}