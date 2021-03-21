package com.example.hiltmavericks

import com.example.hiltmavericks.di.MavericksViewModelComponent
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn

//@Module
//@InstallIn(MavericksViewModelComponent::class)
//abstract class DataModule {
//
//    @Binds
//    abstract fun bindAnalyticsService(
//        repo: RealExampleRepository
//    ): ExampleRepository
//}

@Module
@InstallIn(MavericksViewModelComponent::class)
object DataModule {

    @Provides
    fun provideRepository(
        // Potential dependencies of this type
    ): ExampleRepository {
        return RealExampleRepository()
    }
}