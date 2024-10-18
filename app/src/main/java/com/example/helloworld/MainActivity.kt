package com.example.helloworld

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.helloworld.ui.theme.HelloWorldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HelloWorldTheme {
                // Scaffold to structure the layout
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                            .padding(16.dp)
                    ) {
                        // Display greeting text
                        Greeting("Android")

                        // Add some space
                        Spacer(modifier = Modifier.height(16.dp))

                        // Display a button with a click listener
                        MyButton(onButtonClick = {
                            Toast.makeText(this@MainActivity, "Button clicked!", Toast.LENGTH_SHORT).show()
                        })
                    }
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

// Define a composable for the button
@Composable
fun MyButton(onButtonClick: () -> Unit) {
    Button(
        onClick = onButtonClick,  // Handle button click event
        modifier = Modifier.fillMaxWidth()
    ) {
        Text("Click Me")
    }
}

// Preview the layout with button and text
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloWorldTheme {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Greeting("Android")
            Spacer(modifier = Modifier.height(16.dp))
            MyButton(onButtonClick = {})
        }
    }
}
