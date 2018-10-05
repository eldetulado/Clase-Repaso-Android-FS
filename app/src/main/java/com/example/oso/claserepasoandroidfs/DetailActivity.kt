package com.example.oso.claserepasoandroidfs

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.oso.claserepasoandroidfs.models.Avenger
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val extra: Bundle = intent.extras
        val vengador: Avenger = extra.getParcelable("VENGADOR")
        tvDataAvenger.text = vengador.showData()
    }
}
