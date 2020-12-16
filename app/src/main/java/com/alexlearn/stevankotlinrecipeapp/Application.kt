package com.alexlearn.stevankotlinrecipeapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


//add to manifest android:name=".MyApplication"
@HiltAndroidApp
class Application :Application() {

}