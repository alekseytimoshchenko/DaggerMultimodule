package com.krokosha.data.di

import android.content.Context
import com.krokosha.core.FileManager
import com.krokosha.data.Database
import dagger.Module
import dagger.Provides

@Module
class DataModule {
    @Provides
    fun provideDatabase(
        ctx: Context,
        fileMng: FileManager
    ) = Database(ctx = ctx, fileMng = fileMng)
}