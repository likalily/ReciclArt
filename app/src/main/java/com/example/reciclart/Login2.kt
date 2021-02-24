package com.example.reciclart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login2.*

class Login2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)

    esqueceu_sua_senha.setOnClickListener {
        openNextActivity()
    }
}
private fun openNextActivity () {
    val intent = Intent(this, RecuperarSenha::class.java)
    startActivity(intent)
}
}