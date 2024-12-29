package com.example.serverdatabasep12.ui.viewmodel

import com.example.serverdatabasep12.model.Mahasiswa

sealed class HomeUiState{
    data class Success(val mahasiswa: List<Mahasiswa>):HomeUiState()
    object Error: HomeUiState()
    object Loading: HomeUiState()
}



