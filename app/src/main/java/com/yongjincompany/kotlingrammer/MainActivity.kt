package com.yongjincompany.kotlingrammer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.yongjincompany.kotlingrammer.data.KG
import com.yongjincompany.kotlingrammer.ui.theme.KotlingrammerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlingrammerTheme {
                MyApp{
                    startActivity(ProfileActivity.newIntent(this, it))
                }
                }
            }
        }
    }

@Composable
fun MyApp(navigateToProfile: (KG) -> Unit) {
    Scaffold(
        content = {
            KotlinGrammerHomeContent(navigateToProfile = navigateToProfile)
        }
    )
}