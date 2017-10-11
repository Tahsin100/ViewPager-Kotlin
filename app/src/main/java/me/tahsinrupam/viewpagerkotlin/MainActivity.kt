package me.tahsinrupam.viewpagerkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentManager
import android.support.v4.view.ViewPager
import android.support.v7.app.ActionBar.NAVIGATION_MODE_TABS
import kotlinx.android.synthetic.main.activity_main.*
import me.tahsinrupam.viewpagerkotlin.adapters.CustomPagerAdapter

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = CustomPagerAdapter(supportFragmentManager)
        viewPager.adapter = adapter
        val tabs = arrayOf("Page1","Page2", "Page3")
        repeat(tabs.size) { i ->
            acti
        }
    }

}
