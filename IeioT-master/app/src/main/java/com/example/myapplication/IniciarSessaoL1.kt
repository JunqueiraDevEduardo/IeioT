package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.widget.Button

class IniciarSessaoL1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.iniciar_sessao_l1)
        Log.d("***TAG","onCreate")
        //encontrar o botão que você criou no XML pelo ID
        val entrar: Button = findViewById(R.id.entrar)
        //Configurar a ação do clique
        entrar.setOnClickListener {
            //cria a Intent
        }
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

