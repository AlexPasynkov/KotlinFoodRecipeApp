package com.alexlearn.stevankotlinrecipeapp

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.AndroidViewModel
import com.alexlearn.stevankotlinrecipeapp.data.Repository

class MainViewModel @ViewModelInject constructor(
    private val repository: Repository,
    application: Application): AndroidViewModel(application) {
}