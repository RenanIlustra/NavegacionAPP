package com.renan.componentesvisuaisnavegacao.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.renan.componentesvisuiaisnavegacao.R
import com.renan.componentesvisuiaisnavegacao.databinding.FragmentEmailMainBinding

class EmailMainFragment :Fragment(R.layout.fragment_email_main) {

    private lateinit var binding: FragmentEmailMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEmailMainBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNew.setOnClickListener {
            findNavController().navigate(R.id.action_emailMainFragment_to_emailNewFragment)
        }

        binding.btnDetail.setOnClickListener {
            findNavController().navigate(R.id.action_emailMainFragment_to_emailDetailFragment)
        }
    }
}