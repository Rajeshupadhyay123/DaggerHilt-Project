package com.example.daggerhilt.module

import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Qualifier

class Main2 @Inject constructor(
        @FName private val fName: String,
        @LName private val lName: String
) {

    fun getName() {
        Log.i("raj", "my name is $fName $lName")
    }
}

@Module
@InstallIn(SingletonComponent::class)
class ModuelApp {


    @Provides
    @FName
    fun getFName(): String = "Rajesh"

    @Provides
    @LName
    fun getLName(): String = "upadhyay"
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FName

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class LName