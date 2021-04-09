package com.example.daggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerhilt.demo.Car
import com.example.daggerhilt.module.Main2
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var main:Main

    @Inject
    lateinit var main2: Main2

    @Inject
    lateinit var car:Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main.getName()
        car.get()

        main2.getName()
    }
}