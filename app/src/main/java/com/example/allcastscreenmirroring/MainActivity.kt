package com.example.allcastscreenmirroring

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tvStatus: TextView
    private lateinit var btnStartMirroring: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvStatus = findViewById(R.id.tv_status)
        btnStartMirroring = findViewById(R.id.btn_start_mirroring)

        btnStartMirroring.setOnClickListener {
            startScreenMirroring()
        }
    }

    private fun startScreenMirroring() {
        // Ekran yansıtma işlemini buraya ekleyin
        tvStatus.text = "Status: Mirroring Started"
    }
}

