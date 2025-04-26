package com.example.samiptmgproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold{innerPadding ->
                homeBody(innerPadding)
            }
        }
    }
}

@Composable
fun homeBody(innerPadding : PaddingValues){
    Column(
        modifier = Modifier.padding(innerPadding).background(color = Color(red = 51, green = 255, blue = 153)  ).fillMaxSize().fillMaxHeight()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().height(80.dp).padding(top = 20.dp, end = 20.dp),
            horizontalArrangement = Arrangement.End
        ) {
            Image(
                painter = painterResource(R.drawable.profile),
                contentDescription = null,
                modifier = Modifier.clip(shape = RoundedCornerShape(100.dp))

            )
        }
        Column {
            Row(modifier = Modifier.height(50.dp).padding(start = 30.dp)) {
                Text(text = "Card", textDecoration = null, style = TextStyle(color = Color.White, fontSize = 40.sp),
                    fontWeight = FontWeight.Bold)
            }
            Row(modifier = Modifier.height(20.dp).padding(start = 30.dp)) {
                Text(text = "Simple and easy to use app", textDecoration = null, style = TextStyle(color = Color.White, fontSize = 20.sp),
                    fontWeight = FontWeight.Bold)
            }
        }

        Column (modifier = Modifier.padding(top = 20.dp).height(500.dp)){
            Row (modifier = Modifier.padding(10.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)){
                Card(modifier = Modifier.height(150.dp).width(150.dp)
                    .weight(1f),
                    shape = RoundedCornerShape(10.dp),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 15.dp
                    ),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(red = 224, green = 224,blue = 224)
                    )
                ) {
                    Column (modifier = Modifier.fillMaxHeight().fillMaxWidth(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally){
                        Image(
                        painter = painterResource(R.drawable.book), modifier = Modifier.height(60.dp),
                        contentDescription = null,
                    )
                        Text(text = "Book")
                    }
                }
                Card(modifier = Modifier.height(150.dp).width(150.dp).fillMaxHeight()
                    .weight(1f),
                    shape = RoundedCornerShape(10.dp),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 15.dp
                    ),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(red = 224, green = 224,blue = 224)
                    )
                ) {
                    Column (modifier = Modifier.fillMaxHeight().fillMaxWidth(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally){
                        Image(
                            painter = painterResource(R.drawable.home), modifier = Modifier.height(60.dp),
                            contentDescription = null,
                        )
                        Text(text = "address")
                    }
                }
            }

            Row (modifier = Modifier.padding(10.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)){
                Card(modifier = Modifier.height(150.dp)
                    .weight(1f),
                    shape = RoundedCornerShape(10.dp),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 15.dp
                    ),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(red = 224, green = 224,blue = 224)
                    )
                ) {

                    Column (modifier = Modifier.fillMaxHeight().fillMaxWidth(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally){
                        Image(
                            painter = painterResource(R.drawable.man), modifier = Modifier.height(60.dp),
                            contentDescription = null,
                        )
                        Text(text = "Character")
                    }

                }
                Card(modifier = Modifier.height(150.dp)
                    .weight(1f),
                    shape = RoundedCornerShape(10.dp),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 15.dp
                    ),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(red = 224, green = 224,blue = 224)
                    )
                ) {
                    Column (modifier = Modifier.fillMaxHeight().fillMaxWidth(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally){
                        Image(
                            painter = painterResource(R.drawable.key), modifier = Modifier.height(60.dp),
                            contentDescription = null,
                        )
                        Text(text = "Password")
                    }
                }
            }
            Row (modifier = Modifier.padding(10.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)){
                Card(modifier = Modifier.height(150.dp)
                    .weight(1f),
                    shape = RoundedCornerShape(10.dp),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 15.dp
                    ),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(red = 224, green = 224,blue = 224)
                    )
                ) {
                    Column (modifier = Modifier.fillMaxHeight().fillMaxWidth(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally){
                        Image(
                            painter = painterResource(R.drawable.boxinhand), modifier = Modifier.height(60.dp),
                            contentDescription = null,
                        )
                        Text(text = "Logistics")
                    }
                }
                Card(modifier = Modifier.height(150.dp)
                    .weight(1f),
                    shape = RoundedCornerShape(10.dp),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 15.dp
                    ),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(red = 224, green = 224,blue = 224)
                    )
                ) {
                    Column (modifier = Modifier.fillMaxHeight().fillMaxWidth(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally){
                        Image(
                            painter = painterResource(R.drawable.card), modifier = Modifier.height(60.dp),
                            contentDescription = null,
                        )
                        Text(text = "Bank Card")
                    }
                }
            }
        }
        Column(modifier = Modifier.fillMaxWidth().height(80.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Card (modifier = Modifier.height(80.dp).width(350.dp)
                .weight(1f).fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 25.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = Color(red = 224, green = 224,blue = 224),

            )
            ){
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth().fillMaxHeight())
                     {
                    Image(
                        painter = painterResource(R.drawable.setting),contentDescription = null,
                        modifier = Modifier.padding(start = 10.dp, end = 10.dp).height(55.dp))

                    Text(text = "Settings", fontSize = 50.sp,
                        )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHome(){
    homeBody(innerPadding = PaddingValues(0.dp))
}
