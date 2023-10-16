package com.example.islami_app.hadeeth

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.islami_app.Hadeeth
import com.example.islami_app.constants
import com.example.islami_app.databinding.FragmentHadeethFrgBinding


class hadeeth_frg : Fragment() {

lateinit var viewbinding:FragmentHadeethFrgBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
viewbinding=FragmentHadeethFrgBinding.inflate(layoutInflater,container,false)

        return viewbinding.root



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initrecycler1()

//initrecycler()

    }
lateinit var adapter:ahadeeth_adapter
    private fun initrecycler1() {
        adapter= ahadeeth_adapter(null)
        adapter.onitemclick=object :ahadeeth_adapter.onitemclicklistner{
            override fun onclick(position: Int, item: Hadeeth) {
                starthadeethdetails1(item)
            }
        }
        viewbinding.recycler.adapter=adapter
    }

    private fun starthadeethdetails1(hadeeth: Hadeeth) {
        val intent=Intent(activity,Hadeeth_Details_Activity::class.java)
        intent.putExtra(constants.EXTRA_HADEETH,hadeeth)
        startActivity(intent)


    }


    /*
lateinit var adapter:ahadeeth_adapter
    private fun initrecycler() {
        adapter= ahadeeth_adapter(null)
        adapter.oniteclick=object :ahadeeth_adapter.onitemclicklistner{
            override fun onclick(position: Int, hadeeth: Hadeeth) {
                starthadeethactivity(hadeeth)
            }
        }
        viewbinding.recycler.adapter=adapter

    }
*/
    /*
    private fun starthadeethactivity(hadeeth: Hadeeth) {
        val intent=Intent(activity, Hadeeth_Details_Activity::class.java)
        intent.putExtra(constants.EXTRA_HADEETH,hadeeth)
        startActivity(intent)

    }
*/

    override fun onStart() {
        super.onStart()
        loadhadeethfile1()
        binddata1()






       // starthadeeth()
      //  bindlist()
    }

    private fun binddata1() {
        adapter.binddata(hadeethlist)
    }

    var  hadeethlist= mutableListOf<Hadeeth>()

    private fun loadhadeethfile1() {
        val file=requireActivity().assets.open("hadeeth.txt").bufferedReader().use { it.readText() }
        val singehadeeth=file.trim().split("#")
        singehadeeth.forEach { element->
            val lines=element.trim().split("\n")
            val title=lines[0]


            val content=lines.joinToString("\n")

            val hadeeth=Hadeeth(title, content)
            hadeethlist.add(hadeeth)
       }


    }






















    /*
    private fun bindlist() {
        adapter.binddata(hadeethlist)
    }
    */
     /*
  val hadeethlist= mutableListOf<Hadeeth>()
    private fun starthadeeth() {
        val ahadeeth = requireActivity().assets.open("hadeeth.txt").bufferedReader().use { it.readText() }
        val singlehadeeth=ahadeeth.trim().split("#")
        singlehadeeth.forEach { element->
            val lines=element.trim().split("\n")
            val title=lines[0]
            val content=lines.joinToString("\n")
            val hadeeth1=Hadeeth(title, content)
            hadeethlist.add(hadeeth1)



        }
*/




        }






