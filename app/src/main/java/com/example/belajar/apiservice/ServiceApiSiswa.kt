package com.example.belajar.apiservice

import com.example.belajar.modeldata.DataSiswa
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ServiceApiSiswa {
    @GET(value = "bacateman.php")
    suspend fun getSiswa():List<DataSiswa>

    @POST(value = "insertTM.php")
    suspend fun postSiswa(@Body dataSiswa: DataSiswa):retrofit2.Response<Void>
}