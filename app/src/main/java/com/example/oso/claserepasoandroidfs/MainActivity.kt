package com.example.oso.claserepasoandroidfs

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.oso.claserepasoandroidfs.models.Avenger
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCancel.setOnClickListener {
            this.finish()
        }

        btnSave.setOnClickListener {
            val intent: Intent = Intent(this, DetailActivity::class.java)
            val vengador: Avenger = Avenger(etNameAvenger.text.toString().trim(),
                    etNickNameAvenger.text.toString().trim(),
                    etDescriptionAvenger.text.toString().trim(),
                    etAddress.text.toString().trim(),
                    etAbilities.text.toString().trim(),
                    etAge.text.toString().trim().toInt())
            intent.putExtra("VENGADOR", vengador)
            startActivity(intent)
        }
    }
}
