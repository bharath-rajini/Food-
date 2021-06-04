package com.example.foodapp.model


import com.example.foodapp.model.Result
import com.google.gson.annotations.SerializedName

data class FoodRecipe(
    @SerializedName("results")
    val results: List<Result>,

    )