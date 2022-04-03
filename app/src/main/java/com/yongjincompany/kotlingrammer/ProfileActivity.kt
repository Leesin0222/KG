package com.yongjincompany.kotlingrammer

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import com.yongjincompany.kotlingrammer.data.KG
import com.yongjincompany.kotlingrammer.ui.theme.KotlingrammerTheme

class ProfileActivity : AppCompatActivity() {

    private val kg: KG by lazy {
        intent?.getSerializableExtra(KG_ID) as KG
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlingrammerTheme() {
                Text(text = "${kg.description}")
            }
        }
    }

    companion object {
        private const val  KG_ID = "kg_id"
        fun newIntent(context: Context, kg: KG) =
            Intent(context, ProfileActivity::class.java).apply {
                putExtra(KG_ID, kg)
            }
    }
}