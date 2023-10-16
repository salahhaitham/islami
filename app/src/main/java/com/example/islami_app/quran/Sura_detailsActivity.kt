package com.example.islami_app.quran

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.islami_app.constants
import com.example.islami_app.databinding.SuraDetails1Binding


class Sura_detailsActivity :AppCompatActivity(){
lateinit var viewbindng:SuraDetails1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewbindng= SuraDetails1Binding.inflate(layoutInflater)
        setContentView(viewbindng.root)
        intializeprameters()
        loadverses()
        inittitle(name)
        initbackbottin() }
    private fun initbackbottin() {
        setSupportActionBar(viewbindng.toolpar)
       supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.title=""
    }
    private fun inittitle(name: String) {
viewbindng.suraname.text=name
    }
    private fun loadverses() {
        val filecontent=
            assets.open("$index.txt").bufferedReader().use {
                it.readText()}
        val lines=filecontent.trimEnd().split("\n")
        initrecycler(lines)
    }
lateinit var adapter: veses_adapter
    private fun initrecycler(lines: List<String>) {
        adapter= veses_adapter(lines)

        viewbindng.verseContent.vreseRecyclerview.adapter=adapter
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    lateinit var name:String
var index:Int?=null
    private fun intializeprameters() {
        name=intent.getStringExtra(constants.EXTRA_NAME)?:""
        index=intent.getIntExtra(constants.EXTRA_INDEX,0)

    }


}
/*
class Sura_detailsActivity :AppCompatActivity(){
lateinit var viewbinding:SuraDetails1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewbinding= SuraDetails1Binding.inflate(layoutInflater)
        setContentView(viewbinding.root)
        initpramters()
        loadfiles()
    }

    private fun loadfiles() {
        val filecontent=
            assets.open("$index.txt").bufferedReader().use {
                it.readText()}
        val lines=filecontent.trimEnd().split("\n")
        initrecycler(lines)
    }
    lateinit var adapter:veses_adapter
    private fun initrecycler(lines: List<String>) {

        adapter=veses_adapter(lines)
        viewbinding.verseContent.vreseRecyclerview.adapter=adapter
    }




    lateinit var name:String
var index:Int = 0
    private fun initpramters() {
        name=intent.getStringExtra(constants.EXTRA_NAME)?:""
        index=intent.getIntExtra(constants.EXTRA_INDEX,0)
    }


}
*/



