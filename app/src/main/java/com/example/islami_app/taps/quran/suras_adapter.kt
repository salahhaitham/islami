package com.example.islami_app.taps.quran

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.islami_app.databinding.SurasNameBinding

class suras_adapter(val names: List<String>):RecyclerView.Adapter<suras_adapter.viewholder>(){

    class viewholder(val binding:SurasNameBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        val viewbinding=SurasNameBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return viewholder(viewbinding)
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        holder.binding.surasName.text=names[position]
        if (onitemclick!=null){
            holder.itemView.setOnClickListener{
                onitemclick?.onclick(position,names[position])
            }

        }

    }

    var onitemclick:onitemclicklistner?=null
    interface onitemclicklistner{
        fun onclick(position: Int,name:String)
    }

    override fun getItemCount(): Int =names.size


}