package com.example.serverdatabasep12.service_api

import com.example.serverdatabasep12.model.AllMahasiswaResponse
import com.example.serverdatabasep12.model.Mahasiswa
import com.example.serverdatabasep12.model.MahasiswaDetailResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface MahasiswaService{
    @Headers(
        "Accept: application/json",
        "Content-Type: application/json",
    )


//    @POST("insertmahasiswa.php")
    @POST("store")
    suspend fun insertMahasiswa(@Body mahasiswa: Mahasiswa)

//    @GET("bacamahasiswa.php")
//    suspend fun getAllMahasiswa(): List<Mahasiswa>
    @GET(".")
    suspend fun getAllMahasiswa(): AllMahasiswaResponse

//    @GET("baca1mahasiswa.php/{nim}")
//    suspend fun getMahasiswabyNim(@Query("nim") nim: String):Mahasiswa
    @GET("{nim}")
    suspend fun getMahasiswabyNim(@Path("nim") nim: String):MahasiswaDetailResponse

//    @PUT("editmahasiswa.php/{nim}")
    @PUT("{nim}")
    suspend fun updateMahasiswa(@Path("nim")nim:String, @Body mahasiswa: Mahasiswa)

//    @DELETE("deletemahasiswa.php/{nim}")
    @DELETE("{nim}")
    suspend fun deleteMahasiswa(@Path("nim")nim:String): Response<Void>
}