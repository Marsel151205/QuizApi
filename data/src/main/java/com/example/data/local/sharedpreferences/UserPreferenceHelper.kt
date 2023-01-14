package com.example.data.local.sharedpreferences

import android.content.Context
import android.content.SharedPreferences

class UserPreferenceHelper(context: Context) {
    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences("user-preference", Context.MODE_PRIVATE)

    var balls: Int
        get() = sharedPreferences.getInt("balls", 0)
        set(value) = sharedPreferences.edit().putInt("balls", value).apply()
}