package com.laura.a2_ciclodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("CICLOANDROID","Entramos en el ciclo de vida onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.i("CICLOANDROID","Entramos en el ciclo de vida onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("CICLOANDROID","Entramos en el ciclo de vida onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("CICLOANDROID","Entramos en el ciclo de vida onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("CICLOANDROID","Entramos en el ciclo de vida onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("CICLOANDROID","Entramos en el ciclo de vida onDestroy")
    }
}