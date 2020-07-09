package com.example.sprintpressing.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import com.example.sprintpressing.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
           // textView.text = it
        })
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onClickListener()
    }

    private fun onClickListener(){
        dryClean.setOnClickListener {
            val action =  HomeFragmentDirections.actionNavigationHomeToDryClean()
            Navigation.findNavController(view!!).navigate(action)
        }
        washAndIron.setOnClickListener {
            val action =  HomeFragmentDirections.actionNavigationHomeToWashAndIronFragment()
            Navigation.findNavController(view!!).navigate(action)
        }
        washOnly.setOnClickListener {
            val action =  HomeFragmentDirections.actionNavigationHomeToWashOnlyFragment()
            Navigation.findNavController(view!!).navigate(action)
        }
        ironOnly.setOnClickListener {
            val action =  HomeFragmentDirections.actionNavigationHomeToIrononlyFragment()
            Navigation.findNavController(view!!).navigate(action)
        }
    }
}
