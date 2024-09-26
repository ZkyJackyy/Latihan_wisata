package com.zack.latihan_wisata

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zack.latihan_wisata.AdapterWisata.WisataAdapter
import com.zack.latihan_wisata.ModelWisata.ModelWisata

class HomePage : AppCompatActivity() {

    private lateinit var wisataAdapter :WisataAdapter
    private lateinit var wisataList: List<ModelWisata>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page)

        wisataList = listOf(
            ModelWisata("Sensoji Temple","Asakusa, Tokyo",R.drawable.sensoji,"Tanggal : 20 september 2024", "Sensō-ji adalah kuil tertua di Tokyo, Jepang, yang didirikan pada tahun 645 M. Terletak di distrik Asakusa, kuil ini didedikasikan untuk Bodhisattva Kannon, dewi belas kasih. Pengunjung dapat melihat gerbang Kaminarimon yang megah, yang menjadi ikon kuil. Selain itu, jalan Nakamise yang mengarah ke kuil dipenuhi dengan toko-toko yang menjual makanan dan suvenir khas Jepang.\n" +"\n" +
                    "Kuil ini juga menjadi pusat berbagai festival, terutama Sanja Matsuri, yang diadakan setiap tahun pada bulan Mei. Sensō-ji menarik jutaan pengunjung setiap tahun, baik untuk beribadah maupun wisata. Atmosfer spiritual dan sejarah yang kaya menjadikan tempat ini salah satu tujuan utama di Tokyo."),
            ModelWisata("Sensoji Temple","Asakusa, Tokyo",R.drawable.asakusaa,"Tanggal : 20 september 2024", "Sensō-ji adalah kuil tertua di Tokyo, Jepang, yang didirikan pada tahun 645 M. Terletak di distrik Asakusa, kuil ini didedikasikan untuk Bodhisattva Kannon, dewi belas kasih. Pengunjung dapat melihat gerbang Kaminarimon yang megah, yang menjadi ikon kuil. Selain itu, jalan Nakamise yang mengarah ke kuil dipenuhi dengan toko-toko yang menjual makanan dan suvenir khas Jepang.\n" +"\n" +
                    "Kuil ini juga menjadi pusat berbagai festival, terutama Sanja Matsuri, yang diadakan setiap tahun pada bulan Mei. Sensō-ji menarik jutaan pengunjung setiap tahun, baik untuk beribadah maupun wisata. Atmosfer spiritual dan sejarah yang kaya menjadikan tempat ini salah satu tujuan utama di Tokyo."),
            ModelWisata("Sensoji Temple","Asakusa, Tokyo",R.drawable.matsumo,"Tanggal : 20 september 2024", "Sensō-ji adalah kuil tertua di Tokyo, Jepang, yang didirikan pada tahun 645 M. Terletak di distrik Asakusa, kuil ini didedikasikan untuk Bodhisattva Kannon, dewi belas kasih. Pengunjung dapat melihat gerbang Kaminarimon yang megah, yang menjadi ikon kuil. Selain itu, jalan Nakamise yang mengarah ke kuil dipenuhi dengan toko-toko yang menjual makanan dan suvenir khas Jepang.\n" +"\n" +
                    "Kuil ini juga menjadi pusat berbagai festival, terutama Sanja Matsuri, yang diadakan setiap tahun pada bulan Mei. Sensō-ji menarik jutaan pengunjung setiap tahun, baik untuk beribadah maupun wisata. Atmosfer spiritual dan sejarah yang kaya menjadikan tempat ini salah satu tujuan utama di Tokyo."),
            ModelWisata("Sensoji Temple","Asakusa, Tokyo",R.drawable.fushimii,"Tanggal : 20 september 2024", "Sensō-ji adalah kuil tertua di Tokyo, Jepang, yang didirikan pada tahun 645 M. Terletak di distrik Asakusa, kuil ini didedikasikan untuk Bodhisattva Kannon, dewi belas kasih. Pengunjung dapat melihat gerbang Kaminarimon yang megah, yang menjadi ikon kuil. Selain itu, jalan Nakamise yang mengarah ke kuil dipenuhi dengan toko-toko yang menjual makanan dan suvenir khas Jepang.\n" +"\n" +
                    "Kuil ini juga menjadi pusat berbagai festival, terutama Sanja Matsuri, yang diadakan setiap tahun pada bulan Mei. Sensō-ji menarik jutaan pengunjung setiap tahun, baik untuk beribadah maupun wisata. Atmosfer spiritual dan sejarah yang kaya menjadikan tempat ini salah satu tujuan utama di Tokyo.")
        )

        wisataAdapter = WisataAdapter(wisataList){ wisata ->
            val intent = Intent(this,DetailActivity::class.java)
            intent.putExtra("Wisata",wisata)
            startActivity(intent)
        }

        val recyclerView : RecyclerView = findViewById(R.id.rcView)
        recyclerView.layoutManager =GridLayoutManager(this,2)
        recyclerView.adapter = wisataAdapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}