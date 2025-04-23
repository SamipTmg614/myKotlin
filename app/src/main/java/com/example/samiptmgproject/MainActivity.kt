package com.example.samiptmgproject

import android.graphics.Paint.Style
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.samiptmgproject.ui.theme.SamipTmgProjectTheme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold{ innerPadding ->
                ProfileBody(innerPadding)
        }
    }
}

@Composable
fun ProfileBody(innerPadding : PaddingValues) {
    Column(
        modifier = Modifier.padding(innerPadding).background(color = Color.White).fillMaxSize()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween

        ) {
            Icon(
                imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = null,
                modifier = Modifier.height(50.dp).width(50.dp)
            )

            Text(
                text = "Samip_Tmg",
//                modifier = Modifier
//                    .border(2.dp, Color.Black)  // Adjust the border width and color as needed
//                    .padding(4.dp),  // Optional: Adds padding inside the border to avoid text touching it
//                style = TextStyle(
//                    textDescription = TextDecoration.Underline,
//                    fontWeight = FontWeight.Bold
//                )
            )
            Icon(
                painter = painterResource(R.drawable.baseline_more_horiz_24),
                contentDescription = null,
                modifier = Modifier.height(50.dp).width(50.dp).padding(0.dp)
            )
        }
    }
}



    @Preview(showBackground = true)
    @Composable
    fun PreviewProfile(){
        ProfileBody(innerPadding = PaddingValues(0.dp))
    }
}