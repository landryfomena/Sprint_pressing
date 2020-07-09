package com.example.sprintpressing.ui.washandiron.children

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.sprintpressing.R


class ChildrenFragmen : Fragment() {
    // Store instance variables
    private val title: String? = null
    private val page = 0
    companion object {
        fun newInstance(page: Int, title: String?) :Fragment{
            val fragmentFirst = ChildrenFragmen()
            val args = Bundle()
            args.putInt("someInt", page)
            args.putString("someTitle", title)
            fragmentFirst.setArguments(args)
            return  ChildrenFragmen()
        }
    }

    private lateinit var viewModel: ChildrenViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.children_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ChildrenViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
