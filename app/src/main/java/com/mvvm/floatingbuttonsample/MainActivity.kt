package com.mvvm.floatingbuttonsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mvvm.floatingbuttonsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    private fun initView() {

        var isFabCollapsed = false
        binding.apply {
            btnAdd.setOnClickListener {
                if (!isFabCollapsed) {
                    btnAdd.extend()
                    fabAlarm.show()
                    fabCall.show()
                    fabEmail.show()
                    fabLocation.show()
                    txtAlarm.visibility = View.VISIBLE
                    txtCall.visibility = View.VISIBLE
                    txtEmail.visibility = View.VISIBLE
                    txtLocation.visibility = View.VISIBLE
                    isFabCollapsed = true
                } else {
                    binding.btnAdd.shrink()
                    fabAlarm.hide()
                    fabCall.hide()
                    fabEmail.hide()
                    fabLocation.hide()
                    txtAlarm.visibility = View.GONE
                    txtCall.visibility = View.GONE
                    txtEmail.visibility = View.GONE
                    txtLocation.visibility = View.GONE
                    isFabCollapsed = false
                }
            }
        }
    }
}