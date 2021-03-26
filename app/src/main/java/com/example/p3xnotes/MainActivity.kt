package com.example.p3xnotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    //este es el modelo de datos que se instancia desde la clase Notas
    val notas: List<Notas> = listOf(
        Notas("Prueba 1", "esta es una nota de prueba"),
        Notas("Prueba 2", "esta es una nota de prueba 2"),
        Notas("Prueba 3", "esta es una nota de prueba 3")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniRecycler()
    }

    fun iniRecycler(){
        //Asignamos el layoutManager
        findViewById<RecyclerView>(R.id.rvNotas).layoutManager = LinearLayoutManager(this)
        val adapter = NotasAdapter(notas) //Necesita el listado notas de tipo Notas
        //Asignamos adapter recien creado
        findViewById<RecyclerView>(R.id.rvNotas).adapter = adapter
    }
}