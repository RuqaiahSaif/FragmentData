package com.example1.app3

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.utils.widget.ImageFilterButton
import androidx.core.widget.TextViewCompat
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() ,Fragment_1.Callbacks{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val currentFragment =
            supportFragmentManager.findFragmentById(R.id.fragment_container)
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container, Fragment_1())
            .commit()
        val currentFragment1 =
            supportFragmentManager.findFragmentById(R.id.fragment_container2)
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container2, Fragment_2.newInstance(""))
            .commit()


    }


   /* fun color(color:String) {
        val currentFragment =
            supportFragmentManager.findFragmentById(R.id.fragment_container)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container,Fragment_1.newInstance(color))
            .commit()
    }*/

   override fun send(name: String) {
        val currentFragment1 =
            supportFragmentManager.findFragmentById(R.id.fragment_container2)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container2,Fragment_2.newInstance(name))
            .commit()


}
}