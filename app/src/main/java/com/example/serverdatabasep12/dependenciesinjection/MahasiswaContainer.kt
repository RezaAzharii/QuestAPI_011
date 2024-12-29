package com.example.serverdatabasep12.dependenciesinjection

import com.example.serverdatabasep12.repository.MahasiswaRepository
import com.example.serverdatabasep12.repository.NetworkKontakRepository
import com.example.serverdatabasep12.service_api.MahasiswaService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

interface AppContainer{
    val kontakRepository: MahasiswaRepository
}

