package com.alexlearn.stevankotlinrecipeapp.data

import com.alexlearn.stevankotlinrecipeapp.data.network.FoodRecipesApi
import com.alexlearn.stevankotlinrecipeapp.models.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {

   suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe>{
       return foodRecipesApi.getRecipes(queries)
    }
}