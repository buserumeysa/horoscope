package com.buserkapkiner.horoscope

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun aries1(viev:View){
        val fragmentManager= supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val aries1= Aries()
        fragmentTransaction.replace(R.id.frameLayout,aries1).commit()
    }
    fun taurus1(viev:View){
        val fragmentManager= supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val taurus1= Taurus()
        fragmentTransaction.replace(R.id.frameLayout,taurus1).commit()

    }
    fun gemini1(viev:View){
        val fragmentManager= supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val gemini1= Gemini()
        fragmentTransaction.replace(R.id.frameLayout,gemini1).commit()

    }
}