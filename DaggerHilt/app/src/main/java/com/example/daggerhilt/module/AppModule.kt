package com.example.daggerhilt.module

import com.example.daggerhilt.ImplementOne
import com.example.daggerhilt.One
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/*
@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {

    @Binds
    @Singleton
    abstract fun getOne(
            implementOne: ImplementOne
    ):One
}*/

@Module
@InstallIn(SingletonComponent::class)
class AppModule{

    @Provides
    @Singleton
    fun getOne():One{
        return ImplementOne()
    }
}
/*
    ApplicationComponent is Deprecated in Dagger Version 2.30
ApplicationComponent removed in Dagger Version 2.31
Alternatively SingletonComponent should be used instead of ApplicationComponent
 */