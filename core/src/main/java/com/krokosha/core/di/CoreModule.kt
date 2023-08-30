package com.krokosha.core.di

import com.krokosha.core.FileManager
import dagger.Module
import dagger.Provides

@Module
class CoreModule {
    @Provides
    fun provideFileManager() = FileManager()
}