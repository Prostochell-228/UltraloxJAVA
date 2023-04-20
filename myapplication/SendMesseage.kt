package com.example.myapplication

import android.os.Build
import android.telephony.SmsManager
import android.widget.Toast


class SendMesseage {
  private fun sendSMSmassage() {

      try {

        val smsManager: SmsManager
        if (Build.VERSION.SDK_INT >= 23) {
          smsManager = this.getSystemService(SmsManager::class.java)
        } else {
          smsManager = SmsManager.getDefault()
        }

        smsManager.sendTextMessage(phoneNumber, null, message, null, null)

        Toast.makeText(applicationContext, "Message Sent", Toast.LENGTH_LONG).show()

      } catch (e: Exception) {

        Toast.makeText(
          applicationContext,
          "Please enter all the data.." + e.message.toString(),
          Toast.LENGTH_LONG
        )
          .show() }
  }
}