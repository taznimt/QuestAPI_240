package com.example.belajar.viewmodel

import androidx.compose.runtime.mutableStateOf
import com.example.belajar.modeldata.UIStateSiswa
import com.example.belajar.repositori.RepositoryDataSiswa

class EntryViewModel(private val repositoryDataSiswa: RepositoryDataSiswa):
        viewModel() {
        var uiStateSiswa by mutableStateOf(UIStateSiswa())
            private set

        }