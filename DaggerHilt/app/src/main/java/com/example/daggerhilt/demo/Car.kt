package com.example.daggerhilt.demo

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(val engine: Engine,val wheel: Wheel) {

    fun get(){
        engine.getEngine()
        wheel.getWheel()
        Log.i("car", "car is running")
    }
}