package com.example.islami_app.hadeeth

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.islami_app.Hadeeth
import com.example.islami_app.R
import com.example.islami_app.constants
import com.example.islami_app.databinding.HadeethContentBinding

class Hadeeth_Details_Activity : AppCompatActivity() {
    lateinit var viewbinding:HadeethContentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hadeeth_details)
        viewbinding=HadeethContentBinding.inflate(layoutInflater)
        setContentView(viewbinding.root)

initparam1()
bindviews1()
      // initparam()
      //  bindviews()
    }

    private fun bindviews1() {
        viewbinding.HadeethName1.text=hadeeth?.title
        viewbinding.hadeethcontent.textHadeeth11.text=hadeeth?.content
        bindbackbotton()
    }

    private fun bindbackbotton() {
        setSupportActionBar(viewbinding.toolpar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title?:""

    }

    override fun onSupportNavigateUp(): Boolean {
        return super.onSupportNavigateUp()
        return true
    }


    var hadeeth:Hadeeth?=null
    private fun initparam1() {
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.TIRAMISU){
            hadeeth=intent.getParcelableExtra(constants.EXTRA_HADEETH,Hadeeth::class.java)
        }else{
            hadeeth=intent.getParcelableExtra(constants.EXTRA_HADEETH)as Hadeeth?

        }

    }


/*
    private fun bindviews() {
viewbinding.HadeethName1.text=hadeeth?.title
        viewbinding.hadeethcontent.textHadeeth11.text=hadeeth?.content

    }

    */

/*
     var hadeeth: Hadeeth?=null
    private fun initparam() {
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.TIRAMISU) {
            hadeeth = intent.getParcelableExtra(constants.EXTRA_HADEETH, Hadeeth::class.java)
        }else{
            hadeeth = intent.getParcelableExtra(constants.EXTRA_HADEETH) as Hadeeth?

        }



    }

    */
}