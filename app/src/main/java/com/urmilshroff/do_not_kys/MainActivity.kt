package com.urmilshroff.do_not_kys

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity:AppCompatActivity()
{
    private val MY_PERMISSIONS_REQUEST_CALL:Int=100

    private val mOnNavigationItemSelectedListener=BottomNavigationView.OnNavigationItemSelectedListener {item->
        when(item.itemId)
        {
            R.id.navigation_home->
            {
                message.setText(R.string.title_home)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard->
            {
                message.setText(R.string.title_dashboard)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications->
            {
                message.setText(R.string.title_notifications)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState:Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        floatingActionButtonCallHelpline.setOnClickListener({callHelpline()})
    }

    @SuppressLint("MissingPermission")
    fun callHelpline()
    {
//        if (ContextCompat.checkSelfPermission(this,Manifest.permission.CAMERA)!=PackageManager.PERMISSION_GRANTED)
//        {
//            Toast.makeText(this,"Plese grant phone permissions",Toast.LENGTH_SHORT).show()
//        }
//
//        else
//        {
            val callIntent=Intent(Intent.ACTION_CALL)
            callIntent.data=Uri.parse("tel:+919820872972")
            startActivity(callIntent)
        //}

    }
}