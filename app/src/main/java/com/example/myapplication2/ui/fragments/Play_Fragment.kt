package com.example.myapplication2.ui.fragments

import android.content.Context
import android.os.*
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.myapplication2.R
import kotlinx.android.synthetic.main.fragment_main_.*
import kotlinx.android.synthetic.main.fragment_play_.*


class Play_Fragment : Fragment() {

    var score = 0
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_play_, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_back3.setOnClickListener {
            it.findNavController().navigate(R.id.destination_MainFrag)
        }

        // btn_play is missing in the xml
        btn_start.setOnClickListener {

            // Execute event after 1000 ms = 1 sec
            Handler().postDelayed({
                val didSensorPass = checkSensor()
                if (didSensorPass) {
                    vibrate()
                }
            }, 1000)
        }
    }

    // Return true if check sesor passed;¨otherwise return false
    private fun checkSensor() : Boolean {
        return true
    }

    private fun vibrate() {
        // Do the code to vibrate the code

        val v = activity?.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator?
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            v!!.vibrate(VibrationEffect.createOneShot(250, VibrationEffect.DEFAULT_AMPLITUDE))
        }

    }

}

