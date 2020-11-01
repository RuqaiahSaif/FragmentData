package com.example1.app3

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example1.app3.Fragment_1.Callbacks

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class Fragment_2 : Fragment() {

    private lateinit var text: TextView
    companion object {
        fun newInstance(name: String): Fragment_2 {
            val args = Bundle().apply {
                putSerializable("name", name)
            }

            return Fragment_2().apply {
                arguments = args
            }
        }
    }
    var name: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        name =arguments?.getSerializable("name") as String

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_2, container, false)
        text = view?.findViewById(R.id.text2) as TextView
        text.setText(name)
        return view
    }




}