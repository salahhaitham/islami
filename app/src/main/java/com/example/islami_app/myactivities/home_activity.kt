package com.example.islami_app.myactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.islami_app.*
import com.example.islami_app.databinding.ActivityHomeBinding
import com.example.islami_app.hadeeth.hadeeth_frg
import com.example.islami_app.quran.quran_frag
import com.example.islami_app.fragments.radio_frag
import com.example.islami_app.fragments.tasbeeh_frag
import com.google.android.material.navigation.NavigationBarView

class home_activity : AppCompatActivity() {
    lateinit var viewbinding :ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewbinding=ActivityHomeBinding.inflate(layoutInflater)
        setContentView(viewbinding.root)

        viewbinding.content1.navbut.setOnItemSelectedListener(object :NavigationBarView.OnItemSelectedListener{
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                when(item.itemId){
                    R.id.navigationquran ->{
                        supportFragmentManager.beginTransaction().replace(
                            R.id.container1,
                            quran_frag()
                        ).commit()
                    }
                        R.id.navigationhadeeth ->{
                        supportFragmentManager.beginTransaction().replace(
                            R.id.container1,
                            hadeeth_frg()
                        ).commit()
                    }
                    R.id.navigationsebha ->{
                        supportFragmentManager.beginTransaction().replace(
                            R.id.container1,
                            tasbeeh_frag()
                        ).commit()
                    }
                    R.id.navigationradio ->{
                        supportFragmentManager.beginTransaction().replace(
                            R.id.container1,
                            radio_frag()
                        ).commit()
                    }


                }
                return true
            }




        })
viewbinding.content1.navbut.selectedItemId= R.id.navigationquran



    }





        }





