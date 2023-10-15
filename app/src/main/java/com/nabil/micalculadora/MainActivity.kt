package com.nabil.micalculadora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nabil.micalculadora.ui.theme.MiCalculadoraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiCalculadoraTheme {
               CalculatorScreen()
            }
        }
    }
}




@Preview(showSystemUi = true)
@Composable
fun DefaultPreview() {
    MiCalculadoraTheme {
        CalculatorScreen()
    }
}