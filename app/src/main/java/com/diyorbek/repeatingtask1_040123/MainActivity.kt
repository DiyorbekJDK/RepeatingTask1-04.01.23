package com.diyorbek.repeatingtask1_040123

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.diyorbek.repeatingtask1_040123.adapter.ViewPageAdapter
import com.zhpan.indicator.IndicatorView
import com.zhpan.indicator.enums.IndicatorSlideMode

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        val viewPager: ViewPager2 = findViewById(R.id.viewPager)
        val indicatorView: IndicatorView = findViewById(R.id.indicatorView)
        viewPager.adapter = ViewPageAdapter(supportFragmentManager,lifecycle)
        indicatorView.apply {
            setSliderColor(Color.GRAY,Color.WHITE)
            setSliderWidth(20f)
            setSliderHeight(20f)
            setSlideMode(IndicatorSlideMode.WORM)
            setPageSize(viewPager.adapter?.itemCount!!)
            notifyDataChanged()
        }
        indicatorView.setupWithViewPager(viewPager)
    }
}