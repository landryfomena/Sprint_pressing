package com.example.sprintpressing.ui.washonly

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sprintpressing.R


class washOnlyFragment : Fragment() {

    companion object {
        fun newInstance() =
            washOnlyFragment()
    }

    private lateinit var viewModel: WashOnlyViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.wash_only_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(WashOnlyViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
