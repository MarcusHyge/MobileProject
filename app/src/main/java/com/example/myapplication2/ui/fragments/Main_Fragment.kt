package com.example.myapplication2.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.myapplication2.R
import kotlinx.android.synthetic.main.fragment_main_.*

class Main_Fragment : Fragment()  {
override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                          savedInstanceState: Bundle?): View? {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_main_, container, false)
}
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        //TODO check if mainfragdirections works here
        btn_play.setOnClickListener {
            it.findNavController().navigate(R.id.MainFrag_To_PlayFrag)
        }

        btn_scoreboard.setOnClickListener {
            it.findNavController().navigate(R.id.MainFrag_To_ScoreboardFrag)
        }

        btn_help.setOnClickListener {
            it.findNavController().navigate(R.id.MainFrag_To_HowToFrag)
        }
    }
}

