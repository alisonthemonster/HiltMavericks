package com.example.hiltmavericks

import com.airbnb.mvrx.MavericksState
import com.airbnb.mvrx.MavericksViewModel
import com.airbnb.mvrx.MavericksViewModelFactory
import com.example.hiltmavericks.di.AssistedViewModelFactory
import com.example.hiltmavericks.di.hiltMavericksViewModelFactory
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject

data class ExampleState(
    val string: String
) : MavericksState

class ExampleViewModel @AssistedInject constructor(
    @Assisted state: ExampleState,
    private val repo: ExampleRepository,
) : MavericksViewModel<ExampleState>(state) {

    init {
        setState {
            copy(
                string = repo.getString()
            )
        }
    }

    @AssistedFactory
    interface Factory : AssistedViewModelFactory<ExampleViewModel, ExampleState> {
        override fun create(state: ExampleState): ExampleViewModel
    }

    companion object : MavericksViewModelFactory<ExampleViewModel, ExampleState> by hiltMavericksViewModelFactory()
}