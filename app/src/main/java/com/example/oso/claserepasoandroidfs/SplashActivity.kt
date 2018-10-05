package com.example.oso.claserepasoandroidfs

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class SplashActivity : AppCompatActivity() {

    private lateinit var count: CountDownTimer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_splash)

        count = object : CountDownTimer(3000, 1000) {
            override fun onFinish() {
                val intent: Intent = Intent(this@SplashActivity,
                        MainActivity::class.java)
                startActivity(intent)
                finish()
            }

            override fun onTick(millisUntilFinished: Long) {

            }
        }
        count.start()
    }

    override fun onPause() {
        super.onPause()
        count.cancel()
    }
}
