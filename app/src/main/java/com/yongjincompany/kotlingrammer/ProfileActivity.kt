package com.yongjincompany.kotlingrammer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import com.yongjincompany.kotlingrammer.ui.theme.KotlingrammerTheme

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlingrammerTheme() {
                Text(text = "e.t")
            }
        }
    }
}