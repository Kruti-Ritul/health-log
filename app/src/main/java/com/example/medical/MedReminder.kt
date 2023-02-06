package com.example.medical

import androidx.appcompat.app.AppCompatActivity
import com.example.medical.databinding.MedreminderBinding
import android.content.Intent
import android.os.Bundle
import com.example.medical.Confirm


class MedReminder : AppCompatActivity() {
    private lateinit var binding: MedreminderBinding
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = MedreminderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btncon2.setOnClickListener(){
            val Intent = Intent(this, Confirm::class.java)
            startActivity(Intent)
        }
    }
}