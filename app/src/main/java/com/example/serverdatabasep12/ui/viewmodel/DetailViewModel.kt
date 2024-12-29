package com.example.serverdatabasep12.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.serverdatabasep12.model.Mahasiswa
import com.example.serverdatabasep12.repository.MahasiswaRepository
import com.example.serverdatabasep12.ui.view.DestinasiDetail
import kotlinx.coroutines.launch
import okio.IOException
import retrofit2.HttpException

sealed class DetailUiState {
    data class Success(val mahasiswa: Mahasiswa) : DetailUiState()
    object Error : DetailUiState()
    object Loading : DetailUiState()
}


