package com.example.serverdatabasep12.service_api

import com.example.serverdatabasep12.model.Mahasiswa
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Query

interface MahasiswaService{
    @Headers(
        "Accept: application/json",
        "Content-Type: application/json",
    )


}