package com.example.localbroadcastmanagerdemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class BroadcastReceiverDemo : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if(intent!=null && "My_Action".equals(intent.action)){
            /*Log.v("BroadCast Receiver","[ onReceive ]")*/
            val data  = intent.getStringExtra("Foreign_Key")
            Toast.makeText(context,data,Toast.LENGTH_LONG).show()
        }


    }

}