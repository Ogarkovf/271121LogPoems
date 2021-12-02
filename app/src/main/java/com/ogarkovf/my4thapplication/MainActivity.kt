package com.ogarkovf.my4thapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG="MainActivity"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG,"Лаиса, я люблю твой смелый, вольный взор,")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"Неутолимый жар, открытые желанья,")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"И непрерывные лобзанья,")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"И страсти полный разговор.")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"Люблю горящих уст я вызовы немые,")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"Восторги быстрые, живые")
    }
}