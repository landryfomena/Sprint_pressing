package com.example.sprintpressing.ui.irononly

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.sprintpressing.R

class IrononlyFragment : Fragment() {

    companion object {
        fun newInstance() = IrononlyFragment()
    }

    private lateinit var viewModel: IrononlyViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.irononly_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(IrononlyViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
