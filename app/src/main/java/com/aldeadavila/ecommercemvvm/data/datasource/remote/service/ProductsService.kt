package com.aldeadavila.ecommercemvvm.data.datasource.remote.service


import com.aldeadavila.ecommercemvvm.domain.model.Product
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface ProductsService {

    @GET("products")
    suspend fun getProducts(
    ): Response<List<Product>>

    @Multipart
    @POST("products")
    suspend fun create(
        @Part files: Array<MultipartBody.Part?>,
        @Part("name") name: RequestBody,
        @Part("description") description: RequestBody,
        @Part("id_category") idCategory: RequestBody,
        @Part("price") price: RequestBody,
    ): Response<Product>


}