package com.example.belajar.uicontroller.route

import com.example.belajar.R

object DestinasiDetail : DestinasiNavigasi {
    override val route = "item_details"
    override val tittleRes = R.string.detail_siswa
    const val itemIdArg = "itemId"
    val routeWithArgs = "$route/{$itemIdArg}"
}