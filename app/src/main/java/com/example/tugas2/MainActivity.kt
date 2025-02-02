package com.example.tugas2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas2.ui.theme.Tugas2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tugas2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Biodata(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Biodata(modifier: Modifier = Modifier){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 50.dp)
            .background(color = Color.Gray)
    )
    {
        Text( "Login", fontSize = 50.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.padding(5.dp))
        Text("Ini adalah halaman login", fontSize = 30.sp)
        Spacer(modifier = Modifier.padding(5.dp))
        Image(
            painter = painterResource(id = R.drawable.umy),
            contentDescription = "",
            modifier = Modifier.clip(CircleShape).size(200.dp)
        )
        Spacer(modifier = Modifier.padding(10.dp))
        Text( "Nama",
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic
        )
        Spacer(modifier = Modifier.padding(5.dp))
        Text("Deni Arif WIbowo",
            fontSize = 40.sp,
            fontStyle = FontStyle.Italic
        )
        Spacer(modifier = Modifier.padding(5.dp))
        Text("20220140188",
            fontSize = 60.sp,
            fontStyle = FontStyle.Italic,
        )
        Spacer(modifier = Modifier.padding(5.dp))

        Image(
            painter = painterResource(id = R.drawable.den),
            contentDescription = "",
            modifier = Modifier.size(260.dp)

        )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tugas2Theme {
        Greeting("Android")
    }
}