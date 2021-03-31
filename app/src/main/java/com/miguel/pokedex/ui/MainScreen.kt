package com.miguel.pokedex.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.miguel.pokedex.R
import com.miguel.pokedex.databinding.DashboardLayoutBinding
import com.miguel.pokedex.recyclerviews.MainScreenItemAdapter
import com.miguel.pokedex.recyclerviews.MainScreenNewsAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainScreen : Fragment(R.layout.dashboard_layout) {

    var _binding : DashboardLayoutBinding? = null
    val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        _binding = DashboardLayoutBinding.bind(view)


        binding.apply {
            mainScreenItemRecyclerView.apply {
                adapter = MainScreenItemAdapter()
            }

            newsRecyclerView.apply {
                adapter = MainScreenNewsAdapter()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}