package com.example.islami_app.quran

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.islami_app.databinding.VerseRecyclerBinding


class veses_adapter(var verses: List<String>):RecyclerView.Adapter<veses_adapter.viewholder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        val viewbinding=VerseRecyclerBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return viewholder(viewbinding)
    }

    class viewholder(val viewbinding:VerseRecyclerBinding):RecyclerView.ViewHolder(viewbinding.root)

    override fun onBindViewHolder(holder: viewholder, position: Int) {
       holder.viewbinding.verseDetails1.text=verses[position]
    }



    override fun getItemCount(): Int =verses.size



}














/*
class veses_adapter(val veses: List<String>) :RecyclerView.Adapter<veses_adapter.Viewholder>(){
    class Viewholder(val binding: VerseRecyclerBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        val  binding=VerseRecyclerBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return Viewholder(binding)
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        holder.binding.verseDetails1.text=veses[position]

    }

    override fun getItemCount(): Int =veses.size
}
*/