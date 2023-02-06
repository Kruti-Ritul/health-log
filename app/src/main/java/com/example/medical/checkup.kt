package com.example.medical

import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.medical.databinding.CheckupBinding
import android.content.Intent
import android.os.Bundle
import com.example.medical.Confirm


class checkup : AppCompatActivity() {
    private lateinit var binding: CheckupBinding
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = CheckupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btncheckup.setOnClickListener(){
            val Intent = Intent(this, Confirm::class.java)
            startActivity(Intent)
        }
    }
}