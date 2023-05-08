package com.example.proyectousomenusv4

import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_lista_card_view.*

class ListaCardView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_card_view)
        setSupportActionBar(findViewById(R.id.mitoolbar))
        //supportActionBar?.setHomeAsUpIndicator(android.R.drawable.ic_menu_preferences)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        lista.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        lista.layoutManager = LinearLayoutManager(this);

        var llenarLista = ArrayList<Elementos>()
        for (i in 1 until 20) {
            llenarLista.add(Elementos("Elemento "+i,
                BitmapFactory.decodeResource(resources, R.drawable.imgconfiguracion)))
        }

        val adapter = AdaptadorCardView(llenarLista)
        lista.adapter = adapter

    }
}