package com.example.hiltmavericks

import com.example.hiltmavericks.di.AssistedViewModelFactory
import com.example.hiltmavericks.di.MavericksViewModelComponent
import com.example.hiltmavericks.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.multibindings.IntoMap

@Module
@InstallIn(MavericksViewModelComponent::class)
interface ViewModelsModule {
    @Binds
    @IntoMap
    @ViewModelKey(ExampleViewModel::class)
    fun helloViewModelFactory(factory: ExampleViewModel.Factory): AssistedViewModelFactory<*, *>
}