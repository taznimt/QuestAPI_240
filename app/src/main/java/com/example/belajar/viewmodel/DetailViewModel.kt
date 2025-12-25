package com.example.belajar.viewmodel

import com.example.belajar.modeldata.DataSiswa

sealed interface StatusUIDetail {
    data class Success(val satusiswa: DataSiswa) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}
