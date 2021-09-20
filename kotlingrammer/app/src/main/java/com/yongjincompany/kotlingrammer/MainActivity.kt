package com.yongjincompany.kotlingrammer

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.yongjincompany.kotlingrammer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

        val animDrawble = binding.rootLayout.background as AnimationDrawable
        animDrawble.setEnterFadeDuration(10)
        animDrawble.setExitFadeDuration(5000)
        animDrawble.start()

        binding.developerBtn.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://github.com/Leesin0222")
            startActivity(openURL)
        }
       binding.startBtn.setOnClickListener {
            startActivity(Intent(this, GameActivity::class.java))
            finish()
        }
        binding.dictionaryBtn.setOnClickListener {
            startActivity(Intent(this, DictionaryActivity::class.java))
        }


    }

}