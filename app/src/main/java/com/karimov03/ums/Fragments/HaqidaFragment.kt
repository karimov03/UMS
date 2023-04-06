package com.karimov03.ums.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.karimov03.ums.Data
import com.karimov03.ums.R
import com.karimov03.ums.databinding.FragmentHaqidaBinding


class HaqidaFragment : Fragment() {

    private val binding by lazy {FragmentHaqidaBinding.inflate(layoutInflater)  }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        val position=arguments?.getInt("position")
        val name =arguments?.getString("name")
        if (name=="daqiqalar") {
            binding.tvName.text = Data.daqiqalar[position!!].name
            binding.tvAbout.text =
                Data.daqiqalar[position!!].about + Data.daqiqalar[position!!].fullabout
        }
        else{
            binding.tvName.text = Data.list[position!!].name
            binding.tvAbout.text =
                Data.list[position!!].about + Data.list[position!!].fullabout
        }
        return binding.root
    }
}