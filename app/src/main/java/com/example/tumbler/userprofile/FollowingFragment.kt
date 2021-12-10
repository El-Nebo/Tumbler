package com.example.tumbler.userprofile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tumbler.databinding.FragmentFollowingBinding


class FollowingFragment :Fragment(){
    lateinit var binding: FragmentFollowingBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFollowingBinding.inflate(inflater,container,false)
        return binding.root

    }
}

