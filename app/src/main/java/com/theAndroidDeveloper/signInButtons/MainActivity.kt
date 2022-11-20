package com.theAndroidDeveloper.signInButtons

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.theAndroidDeveloper.signInButtons.ui.theme.SignInButtonsTheme
import com.theandroiddeveloper.brandedbuttons.google.DarkGoogleButton
import com.theandroiddeveloper.brandedbuttons.google.LightGoogleButton

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SignInButtonsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        DarkGoogleButton(onClick = { /*TODO*/ }){ contentColor->
                            Text(text = "Sign up with google", color = contentColor)
                        }
                        Spacer(modifier = Modifier.size(8.dp))
                        LightGoogleButton(onClick = { /*TODO*/ }){ contentColor->
                            Text(text = "Sign up with google", color = contentColor)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SignInButtonsTheme {
        Greeting("Android")
    }
}
