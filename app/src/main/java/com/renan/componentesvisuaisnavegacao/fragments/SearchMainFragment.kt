package com.renan.componentesvisuaisnavegacao.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.renan.componentesvisuiaisnavegacao.databinding.FragmentSearchMainBinding

class SearchMainFragment : Fragment() {

    private lateinit var binding: FragmentSearchMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSearchMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNew.setOnClickListener {

        }

        binding.btnDetail.setOnClickListener {

        }

    }

}