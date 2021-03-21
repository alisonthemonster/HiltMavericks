package com.example.hiltmavericks

import com.example.hiltmavericks.di.MavericksViewModelScoped

interface ExampleRepository {
    fun getString(): String
}

class RealExampleRepository: ExampleRepository {
    override fun getString(): String {
        return "Hello!!!"
    }
}