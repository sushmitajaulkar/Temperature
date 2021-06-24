package org.example.temperature

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton: Button = findViewById(R.id.btn1);
        val etTemp : EditText = findViewById(R.id.etTemp);
        val tvFaren : TextView = findViewById(R.id.tvFaren);

        loginButton.setOnClickListener {
            val c = etTemp.text.toString().toInt();
            val f = (9/5)* c + 32;
            tvFaren.text = f.toString();
            Toast.makeText(this, "Converted Successfully", Toast.LENGTH_LONG).show();
            }
        }

    }
