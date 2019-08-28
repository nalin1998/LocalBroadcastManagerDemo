package com.example.localbroadcastmanagerdemo

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.localbroadcastmanager.content.LocalBroadcastManager

class MainActivity : AppCompatActivity() {

    private val broadcastReceiver = BroadcastReceiverDemo()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //creating Local Broadcast Manager Demo
        /*val localBroadcastManager = LocalBroadcastManager.getInstance(this)

        localBroadcastManager.registerReceiver(broadcastReceiver , IntentFilter("My_Action"))

        LocalBroadcastManager
            .getInstance(this).sendBroadcast(Intent("My_Action").putExtra("key" , "hello world"))*/

        registerReceiver(broadcastReceiver, IntentFilter("My_Action"))
    }

    override fun onDestroy() {
        super.onDestroy()
        /*LocalBroadcastManager.getInstance(this).unregisterReceiver(broadcastReceiver)*/
        unregisterReceiver(broadcastReceiver)
    }
}
