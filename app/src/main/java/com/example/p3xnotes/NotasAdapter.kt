package com.example.p3xnotes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NotasAdapter(val notas: List<Notas>):RecyclerView.Adapter<NotasAdapter.NotasHolder>(){


    class NotasHolder (val view: View):RecyclerView.ViewHolder(view){
        fun render(notas: Notas){
            view.findViewById<TextView>(R.id.tvTitulo).text = notas.Titulo
            view.findViewById<TextView>(R.id.tvNota).text = notas.note
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotasHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return NotasHolder(layoutInflater.inflate(R.layout.item_nota, parent, false))
    }

    override fun onBindViewHolder(holder: NotasHolder, position: Int) {
        holder.render(notas[position])
        //el holder recibe la posicion
    }

    override fun getItemCount(): Int = notas.size
}