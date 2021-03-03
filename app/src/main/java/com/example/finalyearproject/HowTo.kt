package com.example.finalyearproject

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class HowTo : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.howto_activity)

        val host_dec = findViewById<TextView>(R.id.host_desc)
        host_dec.setText(R.string.host_desc)
        val join_desc = findViewById<TextView>(R.id.join_desc)
        join_desc.setText(R.string.join_desc)
        val game_desc = findViewById<TextView>(R.id.game_desc)
        game_desc.setText(R.string.game_desc)





    }

}