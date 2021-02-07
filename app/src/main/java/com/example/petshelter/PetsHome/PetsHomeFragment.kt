package com.example.petshelter.PetsHome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.petshelter.R
import com.example.petshelter.databinding.FragmentPetsHomeBinding

class PetsHomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentPetsHomeBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_pets_home, container, false)

        binding.floatingActionButton.setOnClickListener {
            findNavController().navigate(R.id.action_petsHomeFragment_to_addPetsFragment)
        }

        // Setting the adapter
        val data = loadData()

        val adapter = ListItemView(data)

        binding.recyclerView.adapter = adapter
        return binding.root
    }

    private fun loadData(): List<String> = listOf(
        "hello",
        "adlkf",
        "kdalf",
        "adfs",
        "dklafj",
        "djklaf",
        "al;dfjk",
        "kldsjf",
        "alkdfj",
        "ldksfj",
        "dsrf"
    )
}