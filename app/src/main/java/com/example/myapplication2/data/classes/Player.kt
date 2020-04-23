package com.example.myapplication2.data.classes

import android.view.View

data class Player(
    var Name: View,
    var Score: Int,
    var Raining: Boolean
)
{
override fun toString(): String {
    return "Player(PlayerName='$Name', Score='$Score', Raining='$Raining')"
}
}