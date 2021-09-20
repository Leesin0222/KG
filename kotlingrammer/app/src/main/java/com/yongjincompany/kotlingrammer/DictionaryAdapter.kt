package com.yongjincompany.kotlingrammer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class DictionaryAdapter(private val DictionaryList : ArrayList<Dictionary>) : RecyclerView.Adapter<DictionaryAdapter.DicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DicViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,
        parent, false)
        return DicViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: DicViewHolder, position: Int) {

        val currentItem = DictionaryList[position]
        holder.titleImage.setImageResource(currentItem.Image)
        holder.tvHeading.text = currentItem.heading
    }

    override fun getItemCount(): Int {

        return DictionaryList.size
    }

    class DicViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val titleImage : ShapeableImageView = itemView.findViewById(R.id.image)
        val tvHeading : TextView = itemView.findViewById(R.id.header_title)
    }
}