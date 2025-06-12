package com.reginaldo.ifoodprojeto

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.reginaldo.ifoodprojeto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        with (binding){
            editEmail.text.toString()
            textSenha.text.toString()
            btnEnviar.setOnClickListener {

                val email = editEmail.text.toString()
                val senha = textSenha.text.toString()
                if (email.isEmpty()|| senha.isEmpty()){
                    Toast.makeText(this@MainActivity," campos não podem ser vazio", Toast.LENGTH_SHORT).show()
                }else if (email == "1234" && senha == "1234"){
                    val intent = Intent(this@MainActivity, RestaurantesActivity::class.java)
                    startActivity(intent)

                }else
                {
                    Toast.makeText(this@MainActivity,"Nome  ou senha inválidos", Toast.LENGTH_SHORT)
                        .show()
                }


            }

        }

    }
}