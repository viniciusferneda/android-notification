package com.vferneda.applicationnotification

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.iid.FirebaseInstanceId

class MainActivity : AppCompatActivity() {

    lateinit var btnSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSend = findViewById(R.id.button_sen_notification)
        btnSend.setOnClickListener {
            this.showNotification("1234", "Bootcamp Android", "Kotlin Android curso")
        }

        Log.i("**newToken", FirebaseInstanceId.getInstance().token.toString())
    }

}