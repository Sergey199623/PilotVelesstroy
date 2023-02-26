package com.itikpilotvelesstroy

import com.itikpilotvelesstroy.data.User
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface UserService {

    @POST("users")
    fun createUser(@Body userData: User): Call<Void>

    @POST("users")
    fun createUser(
        @Header("Authorization") token: String,
        @Body userData: User
    ): Call<Void>
}