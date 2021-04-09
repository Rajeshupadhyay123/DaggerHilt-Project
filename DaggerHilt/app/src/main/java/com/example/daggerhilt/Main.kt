package com.example.daggerhilt

import android.util.Log
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject

interface One{

    fun getName()
}

class ImplementOne @Inject constructor(): One{
    override fun getName() {
        Log.i("car", "my name  is prince")
    }

}

class Main @Inject constructor(private val one:One){

    fun getName(){
        one.getName()
    }
 }