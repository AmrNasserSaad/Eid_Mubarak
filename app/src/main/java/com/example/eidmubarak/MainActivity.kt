package com.example.eidmubarak

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CompoundButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.SwitchCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val switchButton = findViewById<SwitchCompat>(R.id.swview)
        val textTextView = findViewById<TextView>(R.id.textView)
        val textSw = findViewById<TextView>(R.id.txtSw)
        val button = findViewById<AppCompatButton>(R.id.btn)

        switchButton.setOnCheckedChangeListener { button, isChecked ->
            if (isChecked) {
                textTextView.text = "بعد العيد \nان شاء لله ."
                textSw.text = "قفلت اللاب"
                textSw.visibility = View.VISIBLE
            } else {
                textSw.text = "             "
                textTextView.text = "هندسه عايزين\n نخلص ال ..."
                textSw.visibility = View.INVISIBLE
            }
        }

        button.setOnClickListener {
            button.visibility = View.INVISIBLE
            val intent = Intent(this, AnimActivity::class.java)
            startActivity(intent)



        }
    }
}