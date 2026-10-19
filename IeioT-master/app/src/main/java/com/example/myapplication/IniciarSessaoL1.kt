package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.util.Log

class IniciarSessaoL1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.iniciar_sessao_l1)
        Log.d("***TAG","onCreate")
        }
    override fun onPause(){
        super.onPause()
        Log.d("***TAG","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("***TAG","onStop")
    }

    override fun onStart() {
        super.onStart()
        Log.d("***TAG","onStart")
    }

    }

