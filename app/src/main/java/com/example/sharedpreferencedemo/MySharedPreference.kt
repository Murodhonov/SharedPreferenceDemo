package com.example.sharedpreferencedemo

import android.content.Context
import android.content.SharedPreferences

object MySharedPreference {
    private const val NAME = "forCache"
    private const val MODE = Context.MODE_PRIVATE
    private lateinit var preferences: SharedPreferences

    fun init(context: Context) {
        preferences = context.getSharedPreferences(NAME, MODE)
    }

    private inline fun SharedPreferences.edit(operations: (SharedPreferences.Editor) -> Unit) {
        val editor = edit()
        operations(editor)
        editor.apply()
    }


    var str:String
        get() {
            return preferences.getString("key1","null")!!
        }
        set(value) {
            preferences.edit().putString("key1",value).apply()
        }

}