package com.example.samiptmgproject

import android.graphics.Paint.Style
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.samiptmgproject.ui.theme.SamipTmgProjectTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold { innerPadding ->
                ProfileBody(innerPadding)
            }
        }
    }
}

@Composable
fun ProfileBody(innerPadding : PaddingValues) {
    Column(
        modifier = Modifier.padding(innerPadding).background(color = Color.White).fillMaxSize().fillMaxHeight()
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
                modifier = Modifier
                    .border(2.dp, Color.Black)  // Adjust the border width and color as needed
                    .padding(4.dp),  // Optional: Adds padding inside the border to avoid text touching it
                style = TextStyle(
                    textDecoration = TextDecoration.Underline,
                    fontWeight = FontWeight.Bold
                )
            )
            Icon(
                painter = painterResource(R.drawable.baseline_more_horiz_24),
                contentDescription = null,
                modifier = Modifier.height(50.dp).width(50.dp).padding(0.dp)
            )
        }
        Row (
            modifier = Modifier.fillMaxWidth().height(100.dp).padding(15.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Image(
                painter = painterResource(R.drawable.profile),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.height(100.dp).width(100.dp).padding(0.dp).fillMaxHeight().clip(shape = RoundedCornerShape(100.dp))

            )
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "124")
                Text(text = "Posts")
            }
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Text(text = "500")
                Text(text = "followed")
            }
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "100k")
                Text(text = "followers")
            }
        }

            Column(
                modifier = Modifier.padding(horizontal = 10.dp,vertical = 15.dp)
            ) {
                Text(text = "Samip Tamang",
                    style = TextStyle(color = Color.Blue, fontWeight = FontWeight.Bold)
                )
                Text(text = "Ai", modifier = Modifier.alpha(alpha = 0.5f) )
                Text(text = "from nepal", modifier = Modifier.alpha(alpha = 0.5f) )
                Text(text = "contact if available", modifier = Modifier.alpha(alpha = 0.5f) )

            }
        Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            OutlinedButton(onClick = {}
            , shape = RoundedCornerShape(10.dp), colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.White
            )) {
                Text(text = "follow")
            }
            OutlinedButton(onClick = {}, shape = RoundedCornerShape(10.dp), colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.Black
            )) {
                Text(text = "message")
            }
            OutlinedButton(onClick = {}, shape = RoundedCornerShape(10.dp), colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.Black
            )) {
                Text(text = "email")
            }
            OutlinedButton(onClick = {}, shape = RoundedCornerShape(10.dp), colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.Black
            )) {
                Icon(imageVector = Icons.Default.KeyboardArrowDown, contentDescription = null)
            }
        }

    }
}



    @Preview(showBackground = true)
    @Composable
    fun PreviewProfile(){
        ProfileBody(innerPadding = PaddingValues(0.dp))
    }
