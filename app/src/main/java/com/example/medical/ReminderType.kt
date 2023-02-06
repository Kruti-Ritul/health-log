package com.example.medical


import android.content.BroadcastReceiver
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.medical.databinding.ActivityMainBinding
import com.example.medical.databinding.ReminderTypeBinding

class ReminderType : AppCompatActivity(){
    private lateinit var binding : ReminderTypeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ReminderTypeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener(){
            val myIntent = Intent(this, checkup::class.java)
            startActivity(myIntent)
        }
        binding.button2.setOnClickListener(){
            val Intent1 = Intent(this, MedReminder::class.java)
            startActivity(Intent1)
        }
        binding.button3.setOnClickListener(){
            val Intent2 = Intent(this, LabTest::class.java)
            startActivity(Intent2)
        }

    }
    }
