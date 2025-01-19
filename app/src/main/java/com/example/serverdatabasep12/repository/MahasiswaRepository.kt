package com.example.serverdatabasep12.repository

import com.example.serverdatabasep12.model.AllMahasiswaResponse
import com.example.serverdatabasep12.model.Mahasiswa
import com.example.serverdatabasep12.model.MahasiswaDetailResponse
import com.example.serverdatabasep12.service_api.MahasiswaService
import okio.IOException

interface MahasiswaRepository{
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)
    suspend fun getMahasiswa(): AllMahasiswaResponse
    suspend fun getMahasiswabyNim(nim: String): Mahasiswa
    suspend fun updateMahasiswa(nim: String, mahasiswa: Mahasiswa)
    suspend fun deleteMahasiswa(nim: String)
}

class NetworkKontakRepository(
    private val kontakApiService: MahasiswaService
): MahasiswaRepository {
    override suspend fun insertMahasiswa(mahasiswa: Mahasiswa) {
        kontakApiService.insertMahasiswa(mahasiswa)
    }

    override suspend fun getMahasiswa(): AllMahasiswaResponse =
        kontakApiService.getAllMahasiswa()

    override suspend fun getMahasiswabyNim(nim: String): Mahasiswa {
        return kontakApiService.getMahasiswabyNim(nim).data
    }

    override suspend fun updateMahasiswa(nim: String, mahasiswa: Mahasiswa) {
        kontakApiService.updateMahasiswa(nim, mahasiswa)
    }

    override suspend fun deleteMahasiswa(nim: String) {
        try {
            val response = kontakApiService.deleteMahasiswa(nim)
            if (!response.isSuccessful){
                throw IOException("Failed to delete kontak. HTTP Status code: " +
                        "${response.code()}")
            }else{
                response.message()
                println(response.message())
            }
        }catch (e: Exception){
            throw e
        }
    }
}