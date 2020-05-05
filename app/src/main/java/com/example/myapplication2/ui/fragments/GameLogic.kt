package com.example.myapplication2.ui.fragments

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Build
import android.os.SystemClock
import android.os.VibrationEffect
import android.os.Vibrator
import androidx.appcompat.app.AppCompatActivity

/**
public class GameLogic(playFragment: Play_Fragment) : SensorEventListener {
    // val sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
    // val sensor: Sensor? = sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE_UNCALIBRATED)
    var score = 0
    var timer = 0
    var GameGoing: Boolean = true

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {

    }

    override fun onSensorChanged(event: SensorEvent?) {
        val axisX = event!!.values[0]
        val axisY = event.values[1]
        val axisZ = event.values[2]
    }

    //Makes a small vibration
    fun vibrate(){
        val v = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator?
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            v!!.vibrate(VibrationEffect.createOneShot(250, VibrationEffect.DEFAULT_AMPLITUDE))
        }
    }

    //GameStart Function
        fun GameStart() {
                var startTime = SystemClock.currentThreadTimeMillis ()
                var vibTime = 1000;
            while(GameGoing){
            }
            if(startTime <= 1000) {
                vibrate()

            }
        }


            //Checks if the phone is still in place if not cancel
            fun checkSensors(){

        }
}
**/



