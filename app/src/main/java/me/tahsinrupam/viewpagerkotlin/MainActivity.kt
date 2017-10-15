package me.tahsinrupam.viewpagerkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentManager
import android.support.v4.view.ViewPager
import android.support.v7.app.ActionBar.NAVIGATION_MODE_TABS
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import me.tahsinrupam.viewpagerkotlin.R.styleable.Toolbar
import me.tahsinrupam.viewpagerkotlin.adapters.CustomPagerAdapter

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar.title = "ViewPager"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val adapter = CustomPagerAdapter(supportFragmentManager)
        viewpager.adapter = adapter
        tabLayout.setupWithViewPager(viewpager)
    }

}
