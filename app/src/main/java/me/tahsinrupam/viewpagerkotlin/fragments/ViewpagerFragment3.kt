package me.tahsinrupam.viewpagerkotlin.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import me.tahsinrupam.viewpagerkotlin.R


/**
 * A simple [Fragment] subclass.
 */
class ViewpagerFragment3 : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_vpfrag_three, container, false)
    }

}// Required empty public constructor
