package com.example.myapplication2.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.myapplication2.R
import kotlinx.android.synthetic.main.fragment_play_.*


class endgame_fragment : Fragment() {
        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                  savedInstanceState: Bundle?): View? {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_how_to_, container, false)
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_back3.setOnClickListener {
        it.findNavController().navigate(R.id.destination_MainFrag)
    }
    }
}