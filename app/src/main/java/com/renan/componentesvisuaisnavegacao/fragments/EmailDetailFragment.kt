package com.renan.componentesvisuaisnavegacao.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.renan.componentesvisuiaisnavegacao.R
import com.renan.componentesvisuiaisnavegacao.databinding.FragmentEmailDetailBinding

class EmailDetailFragment:Fragment(R.layout.fragment_email_detail) {

    private lateinit var binding: FragmentEmailDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEmailDetailBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        "Definir botoes"
    }
}