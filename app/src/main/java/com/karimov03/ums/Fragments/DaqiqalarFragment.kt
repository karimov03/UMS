package com.karimov03.ums.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.karimov03.ums.Adapters.TariflarAdapter
import com.karimov03.ums.Data
import com.karimov03.ums.R
import com.karimov03.ums.databinding.FragmentDaqiqalarBinding


class DaqiqalarFragment : Fragment() {
    private lateinit var tariflarAdapter: TariflarAdapter
    private val binding by lazy { FragmentDaqiqalarBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Data.addDaqiqalar()
        tariflarAdapter= TariflarAdapter(Data.daqiqalar,object:TariflarAdapter.Action{
            override fun OnClick(list: ArrayList<Data.Tariflar>, position: Int) {
                Toast.makeText(context, "$position", Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.haqidaFragment, bundleOf("position" to position,"name" to "daqiqalar"))
            }
        })

        binding.daqiqalarrv.adapter=tariflarAdapter
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {


        return binding.root

    }


}