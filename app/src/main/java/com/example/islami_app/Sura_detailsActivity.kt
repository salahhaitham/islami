package com.example.islami_app

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.islami_app.databinding.SuraDetails1Binding
import com.example.islami_app.taps.quran.veses_adapter

class Sura_detailsActivity :AppCompatActivity(){
    lateinit var viewbinding:SuraDetails1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewbinding= SuraDetails1Binding.inflate(layoutInflater)
        setContentView(viewbinding.root)
        initializePram()
        inittitle()
        loadsurasfile()

    }

    private fun inittitle() {
        setSupportActionBar(viewbinding.toolpar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true);
        viewbinding.suraname.text=name
        supportActionBar?.title=""
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun loadsurasfile() {
val filecontent=
        assets.open("$index.txt").bufferedReader().use {
            it.readText()}
        val lines=filecontent.trimEnd().split("\n")
        initrecycler(lines)
    }
lateinit var adapter:veses_adapter
    private fun initrecycler(lines: List<String>) {
        adapter= veses_adapter(lines)
        viewbinding.verseContent.vreseRecyclerview.adapter=adapter

    }

    lateinit var name:String
var index:Int = 0
    private fun initializePram() {
        name=intent.getStringExtra(constants.EXTRA_NAME)?:""
        index=intent.getIntExtra(constants.EXTRA_INDEX,0)
    }


}