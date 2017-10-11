package me.tahsinrupam.viewpagerkotlin.adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import me.tahsinrupam.viewpagerkotlin.fragments.ViewpagerFragment1
import me.tahsinrupam.viewpagerkotlin.fragments.ViewpagerFragment2
import me.tahsinrupam.viewpagerkotlin.fragments.ViewpagerFragment3

/**
 * Created by Tahsin on 11-Oct-17.
 */


class CustomPagerAdapter(fm: FragmentManager?) : FragmentStatePagerAdapter(fm) {


    private val NUM_PAGES = 3
    override fun getItem(position: Int): Fragment? {

        when(position) {
            0 ->
                return ViewpagerFragment1()
            1 ->
                return ViewpagerFragment2()
            2 ->
                return ViewpagerFragment3()
            else ->
                return null
        }


    }

    override fun getCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return NUM_PAGES
    }


}
