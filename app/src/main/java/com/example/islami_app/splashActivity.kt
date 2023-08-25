package com.example.islami_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

 class splashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
        starthomeactivity()
    }

     private fun starthomeactivity() {

         Handler(Looper.getMainLooper())
             .postDelayed( object :Runnable{
                 override fun run() {
                     val intent=Intent(this@splashActivity,home_activity::class.java)
                     startActivity(intent)
                 }
             },3000)

     }


 }