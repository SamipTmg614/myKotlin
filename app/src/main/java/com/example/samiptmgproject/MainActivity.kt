package com.example.samiptmgproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.samiptmgproject.ui.theme.SamipTmgProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainHeading()
        }
    }
}
@Composable
fun MainHeading(){
    Scaffold{ innerPadding ->
        Row (
            modifier = Modifier.padding(innerPadding)
        ){
            Text(text = "hello")
            Text(text = "Samip")
        }

    }
}
@Composable

fun MainBody(){

}
@Composable
fun Mainfoot(){

}