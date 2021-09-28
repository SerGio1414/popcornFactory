package com.example.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

data class ObjetosNegocio(var titulo:String = "",
                          var image:Int = 0,
                          var header:Int = 0,
                          var sinopsis:String = "",
                          var seats:ArrayList<Client> = arrayListOf<Client>()
)

data class Client (var nombre:String = "",
                   var tipoPago:String="",
                   var asiento:Int = 0
)
