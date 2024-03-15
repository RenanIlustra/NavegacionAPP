package com.renan.componentesvisuaisnavegacao.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavHostController
import androidx.navigation.fragment.findNavController
import com.renan.componentesvisuiaisnavegacao.R
import com.renan.componentesvisuiaisnavegacao.databinding.FragmentCalendarMainBinding

class CalendarMainFragment : Fragment() {

    private lateinit var binding: FragmentCalendarMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCalendarMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNew.setOnClickListener {
           findNavController().navigate(R.id.action_calendarMainFragment_to_calendarNewFragment)

        }

        binding.btnDetail.setOnClickListener {
            findNavController().navigate(R.id.action_calendarMainFragment_to_calendarDetailFragment)
        }

    }

}