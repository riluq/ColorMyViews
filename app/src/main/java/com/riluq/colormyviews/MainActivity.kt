package com.riluq.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()
    }

    private fun setListener() {
        val clickableViews: List<View> =
                listOf(tv_box_one, tv_box_two, tv_box_three, tv_box_four, tv_box_five, constraint_layout,
                    btn_red, btn_yellow, btn_green)
        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View?) {
        when(view?.id) {
            // using Color class colors for background
            R.id.tv_box_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.tv_box_two -> view.setBackgroundColor(Color.GRAY)
            // using Android color resources for background
            R.id.tv_box_three -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.tv_box_four -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.tv_box_five -> view.setBackgroundResource(android.R.color.holo_green_light)
            // using custom colors for background
            R.id.btn_red -> tv_box_three.setBackgroundResource(R.color.my_red)
            R.id.btn_yellow -> tv_box_four.setBackgroundResource(R.color.my_yellow)
            R.id.btn_green -> tv_box_five.setBackgroundResource(R.color.my_green)

            else -> view?.setBackgroundColor(Color.LTGRAY)
        }
    }
}
