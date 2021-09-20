package com.yongjincompany.kotlingrammer

import android.app.Dialog
import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.yongjincompany.kotlingrammer.databinding.ActivityMainBinding
import java.lang.System.exit

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //화면 가득 채워 날 물먹게 하소서 아멘(?)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

        val animDrawble = binding.rootLayout.background as AnimationDrawable
        animDrawble.setEnterFadeDuration(10)
        animDrawble.setExitFadeDuration(5000)
        animDrawble.start()

        binding.startBtn.setOnClickListener {
            startActivity(Intent(this, GameActivity::class.java))
            finish()
        }
        binding.developerBtn.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://github.com/Leesin0222")
            startActivity(openURL)
        }
        binding.dictionaryBtn.setOnClickListener {
            startActivity(Intent(this, DictionaryActivity::class.java))
        }
        binding.easteregg.setOnClickListener {
            startActivity(Intent(this, EasterEggActivity::class.java))
        }

    }

    override fun onBackPressed() {

        val kBuilder = AlertDialog.Builder(this)
        kBuilder.setMessage("정말로 종료하시겠습니까?")
        kBuilder.setTitle("KotlinGrammer")
        kBuilder.setIcon(R.drawable.kotlin_icon)

        kBuilder.setPositiveButton("나가기"){
            Dialog,which->
            exit()
        }
        kBuilder.setNegativeButton("취소"){
            Dialog,which->
        }
        val createBuild = kBuilder.create()
        createBuild.show()
    }

    private fun exit() {
        super.onBackPressed()
    }

}