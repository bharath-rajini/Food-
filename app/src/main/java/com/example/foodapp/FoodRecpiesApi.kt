package com.example.foodapp

import com.example.foodapp.model.FoodRecipe
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface FoodRecpiesApi {

    @GET("/recipes/complexSearch")
    suspend fun   getRecpies(
        @QueryMap  queryMap: Map<String,String>
    ):Response<FoodRecipe>
}