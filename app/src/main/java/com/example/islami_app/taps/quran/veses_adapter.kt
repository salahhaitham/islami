package com.example.islami_app.taps.quran

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.islami_app.databinding.SuraDetails1Binding
import com.example.islami_app.databinding.VerseRecyclerBinding

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