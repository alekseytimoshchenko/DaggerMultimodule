package com.krokosha.network.di

import com.krokosha.network.TaskApi
import dagger.Module
import dagger.Provides

@Module
class NetworkModule {
    @Provides
    fun provideTaskApi() = object : TaskApi { }
}