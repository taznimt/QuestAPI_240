package com.example.belajar.repositori

import com.example.belajar.apiservice.ServiceApiSiswa
import com.example.belajar.modeldata.DataSiswa

interface RepositoryDataSiswa {
    suspend fun getDataSiswa(): List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa: DataSiswa) : retrofit2.Response<Void>

    suspend fun getSatuSiswa(id:Int) : DataSiswa

}

class JaringanRepositoryDataSiswa(
    private val serviceApiSiswa: ServiceApiSiswa
): RepositoryDataSiswa{
    override suspend fun getDataSiswa(): List<DataSiswa> = serviceApiSiswa.getSiswa()
    override suspend fun postDataSiswa(dataSiswa : DataSiswa):retrofit2.Response<Void> = serviceApiSiswa.postSiswa(dataSiswa)
}
