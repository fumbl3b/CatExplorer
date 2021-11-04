package com.example.catexplorer.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.catexplorer.R

class CatListFragment : Fragment() {

    companion object {
        fun newInstance() = CatListFragment()
    }

    private lateinit var viewModel: CatListViewModel
    // or maybe private val viewModel by activityViewModels<CatListViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.cat_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[CatListViewModel::class.java]
        // TODO: Use the ViewModel
    }

}