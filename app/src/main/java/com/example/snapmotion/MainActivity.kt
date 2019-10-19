package com.example.snapmotion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val binding  = DataBindingUtil.setContentView(this,R.layout.activity_main)


        favouritesActionContainer.setOnClickListener {


        }

        homeActionContainer.setOnClickListener {


        }

        bookmarkActionContainer.setOnClickListener {


        }

    }
}
