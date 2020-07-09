package com.example.sprintpressing.ui.washandiron.women

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.sprintpressing.R
import com.example.sprintpressing.ui.washandiron.children.ChildrenFragmen

class WomenFragment : Fragment() {

    companion object {
        fun newInstance(page: Int, title: String?) :Fragment{
            val fragmentFirst = WomenFragment()
            val args = Bundle()
            args.putInt("someInt", page)
            args.putString("someTitle", title)
            fragmentFirst.setArguments(args)
            return  WomenFragment()
        }
    }

    private lateinit var viewModel: WomenViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.women_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(WomenViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
