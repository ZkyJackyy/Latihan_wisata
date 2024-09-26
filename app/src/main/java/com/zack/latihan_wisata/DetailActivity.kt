package com.zack.latihan_wisata

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.zack.latihan_wisata.ModelWisata.ModelWisata

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)

        val wisata = intent.getParcelableExtra<ModelWisata>("Wisata")

        if (wisata != null){
            val namaTV : TextView = findViewById(R.id.namaTV)
            val lokasiTV : TextView = findViewById(R.id.lokaiTV)
            val tglTv : TextView = findViewById(R.id.tglTV)
            val detailTV : TextView = findViewById(R.id.detailTV)
            val gambarIV : ImageView = findViewById(R.id.gambarIV)

            namaTV.text = wisata.nama
            lokasiTV.text = wisata.lokasi
            tglTv.text = wisata.taggal
            detailTV.text =wisata.Detail
            gambarIV.setImageResource(wisata.gambar)

         }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}