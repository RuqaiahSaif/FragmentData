package com.example1.app3

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.widget.TextViewCompat


class Fragment_1 : Fragment() {

    private lateinit var text: TextView
    private lateinit var button1: Button
    private var name: String? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view=inflater.inflate(R.layout.fragment_1, container, false)
        button1 = view?.findViewById(R.id.button1) as Button


        return view
    }

    override fun onStart() {
        super.onStart()
        button1.setOnClickListener {
            callbacks?.send("my name is roqia")
        }
    }
    interface Callbacks{
        fun send(name:String)
    }
private var callbacks:Callbacks?=null
    override fun onAttach(context: Context) {
        super.onAttach(context)
        callbacks=context as Callbacks
    }

    override fun onDetach() {
        super.onDetach()
        callbacks=null
    }
}
