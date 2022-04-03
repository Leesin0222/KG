package com.yongjincompany.kotlingrammer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
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

@Composable
fun MyApp() {
    Scaffold(
        content = {
            KotlinGrammerHomeContent()
        }
    )
}