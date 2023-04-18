package com.example.myapplication

import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager


lateinit var sensorManager: SensorManager;
private var mSensorManager: SensorManager? = null
private var mOrientation: Sensor? = null

private var xy_angle = 0f
private var xz_angle = 0f
private var zy_angle = 0f

class SensorTrack :SensorEventListener {

  override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
    //Изменение точности показани
  }

  override fun onSensorChanged(event: SensorEvent?) {
    event?.let {
      xy_angle = it.values[0]
      xz_angle = it.values[1];
      zy_angle = it.values[2];
    }
  }
}
