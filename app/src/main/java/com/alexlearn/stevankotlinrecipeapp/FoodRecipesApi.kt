package com.alexlearn.stevankotlinrecipeapp

import com.alexlearn.stevankotlinrecipeapp.models.FoodRecipe
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap
import java.time.temporal.TemporalQueries

interface FoodRecipesApi {

    @GET("recipes/complexSearch")
   suspend fun getRecipes(
        @QueryMap queries: Map<String, String>
    ): Response<FoodRecipe>
}