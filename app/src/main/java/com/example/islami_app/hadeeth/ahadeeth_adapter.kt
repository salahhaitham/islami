package com.example.islami_app.hadeeth

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.islami_app.Hadeeth
import com.example.islami_app.databinding.Itemhadeth1Binding

class ahadeeth_adapter(var listhadeeth:MutableList<Hadeeth>?):RecyclerView.Adapter<ahadeeth_adapter.viewholder>(){


    class viewholder(val viewbinding:Itemhadeth1Binding):RecyclerView.ViewHolder(viewbinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        val viewbinding=Itemhadeth1Binding.inflate(LayoutInflater.from(parent.context),parent,false)
        return viewholder(viewbinding)
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        holder.viewbinding.hadeethTitle.text=listhadeeth!![position].title
        if (onitemclick!=null){
            holder.viewbinding.root.setOnClickListener{
                onitemclick?.onclick(position,listhadeeth!![position])
            }
        }
    }

    override fun getItemCount(): Int =listhadeeth?.size?:0
    fun binddata( newlist:MutableList<Hadeeth>){
        listhadeeth=newlist
        notifyDataSetChanged()

    }
    var onitemclick:onitemclicklistner?=null
    interface onitemclicklistner{
        fun onclick(position: Int,item:Hadeeth)
    }
}






























/*

class ahadeeth_adapter(var items: List<Hadeeth>?):RecyclerView.Adapter<ahadeeth_adapter.viewholder>(){

    class viewholder(var viewbinding:Itemhadeth1Binding):RecyclerView.ViewHolder(viewbinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        val viewbinding=Itemhadeth1Binding.inflate(LayoutInflater.from(parent.context),parent,false)
        return viewholder(viewbinding)
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        holder.viewbinding.hadeethTitle.text=items!![position].title
        if (oniteclick!=null){
            holder.viewbinding.root.setOnClickListener{
                oniteclick?.onclick(position,items!![position])
            }
        }
    }

    override fun getItemCount(): Int =items?.size?:0
    fun binddata(newList:List<Hadeeth>){
        items=newList
        notifyDataSetChanged()

    }

    var oniteclick:onitemclicklistner?=null
    interface onitemclicklistner{
        fun onclick(position: Int,hadeeth:Hadeeth)
    }


}


*/













/*

class ahadeeth_adapter (private var hadeethtitle:List<Hadeeth>?):RecyclerView.Adapter<ahadeeth_adapter.viewholder>() {
    class viewholder(val viewbinding: Itemhadeth1Binding) :
        RecyclerView.ViewHolder(viewbinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        val viewbinding =
            Itemhadeth1Binding.inflate(LayoutInflater.from(parent.context), parent, false)
        return viewholder(viewbinding)
    }
    override fun onBindViewHolder(holder: viewholder, position: Int) {
        holder.viewbinding.hadeethTitle.text = hadeethtitle!![position].title
if (onitemclick!=null){
    holder.viewbinding.root.setOnClickListener{
        onitemclick!!.oncliclk(position,hadeethtitle!![position])

    } }
    }

    override fun getItemCount(): Int = hadeethtitle?.size?:0
    fun binddata(newList:List<Hadeeth>){
        hadeethtitle= newList
        notifyDataSetChanged()
    }
     var onitemclick: onitemclicklistner?=null
interface onitemclicklistner{
    fun oncliclk(position: Int,item:Hadeeth)

}

}
*/