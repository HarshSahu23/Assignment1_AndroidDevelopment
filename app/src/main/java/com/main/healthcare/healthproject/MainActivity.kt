package com.main.healthcare.healthproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.main.healthcare.healthproject.ui.theme.HealthProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HealthProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
@Composable
fun CustomWidget(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Cyan), ) {
        Card(modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth(), shape = RoundedCornerShape(11.dp), elevation = CardDefaults.cardElevation(defaultElevation = 5.dp)) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "#Harsh Sahu",modifier = Modifier.padding(10.dp).align(Alignment.CenterHorizontally))
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                    Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(vertical = 3.dp, horizontal = 10.dp).align(Alignment.CenterHorizontally)) {
                        Text(text = "Ok",modifier = Modifier.padding(3.dp))
                    }
                    Spacer(modifier = Modifier.padding(vertical = 10.dp))
                }            }
        }
    }


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HealthProjectTheme {
        CustomWidget()
    }
}