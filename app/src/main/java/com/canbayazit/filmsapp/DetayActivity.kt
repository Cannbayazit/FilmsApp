package com.canbayazit.filmsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detay.*
import kotlinx.android.synthetic.main.activity_detay.textViewFilmAd
import kotlinx.android.synthetic.main.film_card_tasarim.*

class DetayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detay)

        val film = intent.getSerializableExtra("filmNesne") as Filmler


        textViewFilmAd.text = film.film_ad
        textViewFilmYil.text = (film.film_yil).toString()
        textViewYonetmen.text = film.yonetmen.yonetmen_ad

        imageViewResim.setImageResource(resources.getIdentifier(film.film_resim,"drawable",packageName))



    }
}