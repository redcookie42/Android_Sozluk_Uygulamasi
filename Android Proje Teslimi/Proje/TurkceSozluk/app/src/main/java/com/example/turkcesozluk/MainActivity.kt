package com.example.turkcesozluk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        devam_et.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(this,CeviriActivity::class.java)
        startActivity(intent)
    }
}
