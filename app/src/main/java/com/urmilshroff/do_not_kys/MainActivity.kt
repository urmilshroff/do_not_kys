package com.urmilshroff.do_not_kys

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.telephony.TelephonyManager
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.net.Uri


class MainActivity:AppCompatActivity()
{

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
        floatingActionButtonCallHelpline.setOnClickListener(callHelpline())
    }

    fun callHelpline(): View.OnClickListener? {
        val callIntent = Intent(Intent.ACTION_CALL)
        callIntent.data = Uri.parse("tel:+91-22-27546669")
        startActivity(callIntent)

    }
}