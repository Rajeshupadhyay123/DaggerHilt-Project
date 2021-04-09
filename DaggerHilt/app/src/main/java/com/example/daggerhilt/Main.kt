package com.example.daggerhilt

import android.util.Log
import javax.inject.Inject

interface One{

    fun getName()
}

class ImplementOne @Inject constructor(private val name:String): One{
    override fun getName() {
        Log.i("car", "my name  is $name")
    }

}

class Main @Inject constructor(private val one:One){

    fun getName(){
        one.getName()
    }
 }