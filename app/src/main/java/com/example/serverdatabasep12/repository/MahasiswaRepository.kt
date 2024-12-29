package com.example.serverdatabasep12.repository

import com.example.serverdatabasep12.model.Mahasiswa
import com.example.serverdatabasep12.service_api.MahasiswaService
import okio.IOException

interface MahasiswaRepository{
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)
    suspend fun getMahasiswa(): List<Mahasiswa>
    suspend fun getMahasiswabyNim(nim: String): Mahasiswa
    suspend fun updateMahasiswa(nim: String, mahasiswa: Mahasiswa)
    suspend fun deleteMahasiswa(nim: String)
}

