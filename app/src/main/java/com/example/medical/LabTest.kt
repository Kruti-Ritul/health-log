package com.example.medical

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import com.example.medical.Confirm
import com.example.medical.databinding.LabtestBinding


class LabTest: AppCompatActivity() {
    private lateinit var binding: LabtestBinding
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = LabtestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btncon3.setOnClickListener(){
            val Intent = Intent(this, Confirm::class.java)
            startActivity(Intent)
        }
    }
}