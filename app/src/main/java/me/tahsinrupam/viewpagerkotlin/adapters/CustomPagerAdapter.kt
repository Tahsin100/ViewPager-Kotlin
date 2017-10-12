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

        return when(position) {
            0 ->
                ViewpagerFragment1()
            1 ->
                ViewpagerFragment2()
            2 ->
                ViewpagerFragment3()
            else ->
                null
        }


    }


    override fun getPageTitle(position: Int): CharSequence {
        var title = ""
        when(position){
            0 ->
                title = "Page1"
            1 ->
                title = "Page2"
            2 ->
                title = "Page3"

        }

        return title
    }

    override fun getCount(): Int {
        return NUM_PAGES
    }


}
