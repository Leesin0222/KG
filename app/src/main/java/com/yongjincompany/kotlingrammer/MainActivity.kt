package com.yongjincompany.kotlingrammer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.yongjincompany.kotlingrammer.ui.theme.KotlingrammerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlingrammerTheme {
                MyApp()
                }
            }
        }
    }
}

@Composable
fun MyApp() {
    Scaffold(
        content = {
            kotlingrammerHomeContent()
        }
    )
}