package com.example.serverdatabasep12.ui.view

import com.example.serverdatabasep12.ui.navigation.DestinasiNavigasi

object DestinasiDetail: DestinasiNavigasi{
    override val route = "detail"
    override val titleRes = "Detail Mhs"
    const val NIM = "nim"
    val routesWithArg = "$route/{$NIM}"
}


