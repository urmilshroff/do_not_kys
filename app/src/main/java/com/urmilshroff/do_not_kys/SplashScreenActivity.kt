package com.urmilshroff.do_not_kys

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity

class SplashScreenActivity:AppCompatActivity()
{
    val delay:Long=2000 //shows splash screen for 2 seconds

    override fun onCreate(savedInstanceState:Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed(
            {
                val displayLogin=Intent(this,MainActivity::class.java)
                startActivity(displayLogin)
                finish()
            },delay)
    }
}