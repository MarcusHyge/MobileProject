package com.example.myapplication2.ui.activites

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.myapplication2.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), SensorEventListener {

    //val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

    private var AsensorManager : SensorManager?= null
    private var mAccelerometer : Sensor?= null
    //var gameview : gameview ?= null
    var FishingPoleAngle = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navController = Navigation.findNavController(this,
            R.id.nav_host_fragment
        )


        setupBottomSettings(navController)

        AsensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        mAccelerometer = AsensorManager!!.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)



    }



    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {

    }


    override fun onSensorChanged(event: SensorEvent?) {
        }

    private fun setupBottomSettings(navController: NavController) {
        bottom_settings?.let{
            NavigationUI.setupWithNavController(it, navController)
        }
    }
}

