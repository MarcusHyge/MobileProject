package com.example.myapplication2.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.myapplication2.R
import kotlinx.android.synthetic.main.fragment_settings_.*

class Settings_Fragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_settings_, container, false)
    }

        /*btn_settings.setOnClickListener {
            it.findNavController().navigate(Main_FragmentDirections.MainFragToPlayFrag())
        }
        */
        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            btn_back5.setOnClickListener {
                it.findNavController().navigate(R.id.destination_MainFrag)
            }
        }
}
