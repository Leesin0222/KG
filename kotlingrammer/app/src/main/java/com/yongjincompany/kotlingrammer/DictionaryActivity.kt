package com.yongjincompany.kotlingrammer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DictionaryActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArraylist : ArrayList<Dictionary>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dictionary)

        imageId = arrayOf(
            R.drawable.ic_round_school_24,
            R.drawable.ic_round_school_24,
            R.drawable.ic_round_school_24,
            R.drawable.ic_round_android_24,
            R.drawable.ic_round_android_24,
            R.drawable.ic_round_android_24
        )

        heading = arrayOf(
            "var count: Int = 10",
            "val languageName: String = ${"hello"}",
            "val languageName: String? = null",
            "class Korea(val lands: List<land>)",
            "val value = if(string.isEmpty()) 0 else 1",
            "val value = if(string.isEmpty()) { \n" +
                    "    0\n" +
                    "} else {\n" +
                    "    1\n" +
                    "}"
        )

        newRecyclerView = findViewById(R.id.recyclerview)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArraylist = arrayListOf()
        getUserdata()
    }

    private fun getUserdata() {

        for(i in imageId.indices){

            val dictionary = Dictionary(imageId[i], heading[i])
            newArraylist.add(dictionary)
        }

        newRecyclerView.adapter = DictionaryAdapter(newArraylist)
    }
}