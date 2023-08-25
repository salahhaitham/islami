package com.example.islami_app.taps.quran

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.islami_app.databinding.SurasNameBinding

class suras_adapter(private val names:List<String>) : RecyclerView.Adapter<suras_adapter.Viewholder>() {

    class Viewholder(val viewbinding:SurasNameBinding):RecyclerView.ViewHolder(viewbinding.root) {



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
var viewbinding=SurasNameBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return Viewholder(viewbinding)
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
         holder.viewbinding.surasName.text=names[position]
    }

    override fun getItemCount(): Int {
       return names.size
    }
}