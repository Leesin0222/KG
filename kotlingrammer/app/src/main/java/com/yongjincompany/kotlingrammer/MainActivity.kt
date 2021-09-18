package com.yongjincompany.kotlingrammer

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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


    }
}