package com.example.reciclart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login2.*
import kotlinx.android.synthetic.main.activity_nova_senha.*
import kotlinx.android.synthetic.main.activity_recuperar_senha.*

class RecuperarSenha : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar_senha)

        concluir.setOnClickListener {
            openNextActivity()
        }
    }







    class RecuperarSenha : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar_senha)

        private fun openNextActivity() {
            val intent = Intent(this, NovaSenha::class.java)
            startActivity(intent)

            next_button.setOnClickListener {
                openNextActivity()
            }
        }

        private fun openNextActivity() {
            val intent = Intent(this, Login2::class.java)
            startActivity(intent)
        }
    }
}