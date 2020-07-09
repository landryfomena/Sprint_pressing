package com.example.sprintpressing.ui.dryclean

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.sprintpressing.R

class DryClean : Fragment() {

    companion object {
        fun newInstance() = DryClean()
    }

    private lateinit var viewModel: DryCleanViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.dry_clean_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DryCleanViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
