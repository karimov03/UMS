package com.karimov03.ums.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.karimov03.ums.R
import com.karimov03.ums.databinding.ActivityMainBinding
import com.karimov03.ums.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        binding.imgTariflar.setOnClickListener {
            findNavController().navigate(R.id.tariflarFragment)
        }
        binding.imgDaqiqalar.setOnClickListener {
            findNavController().navigate(R.id.daqiqalarFragment)
        }
        return binding.root
    }

}