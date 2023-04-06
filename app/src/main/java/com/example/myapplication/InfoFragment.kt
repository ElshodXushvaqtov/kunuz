package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentInfoBinding
import com.example.myapplication.module.Item

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class InfoFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentInfoBinding.inflate(layoutInflater, container, false)
        val item = arguments?.getSerializable("item") as Item
        binding.infoImg.setImageResource(item.image)
        binding.infoDate.text = item.data
        binding.infoName.text = item.name
        binding.back.setOnClickListener {
            findNavController().navigate(R.id.action_infoFragment_to_homeFragment)
        }
        binding.toHome?.setOnClickListener {
            findNavController().navigate(R.id.action_infoFragment_to_homeFragment)
        }
        return binding.root
    }


}