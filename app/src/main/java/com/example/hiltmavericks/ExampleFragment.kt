package com.example.hiltmavericks

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.airbnb.mvrx.MavericksView
import com.airbnb.mvrx.fragmentViewModel
import com.airbnb.mvrx.withState
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ExampleFragment : Fragment(), MavericksView {
    val viewModel: ExampleViewModel by fragmentViewModel()

    lateinit var textView: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_example, container, false)

        textView = view.findViewById(R.id.string)
        return view
    }


    override fun invalidate() = withState(viewModel) { state ->
        textView.text = state.string
    }


}