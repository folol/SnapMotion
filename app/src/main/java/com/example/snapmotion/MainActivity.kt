package com.example.snapmotion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.HapticFeedbackConstants
import android.view.View
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val binding  = DataBindingUtil.setContentView(this,R.layout.activity_main)


        fav_icon.setOnClickListener {

            doTransition(R.id.left_state)

        }

        fav_label.setOnClickListener {

            doTransition(R.id.left_state)

        }

        home_icon.setOnClickListener {

            doTransition(R.id.center_state)

        }

        bookmark_icon.setOnClickListener {

            doTransition(R.id.right_state)

        }

        bookmark_label.setOnClickListener {

            doTransition(R.id.right_state)

        }

    }

    private fun doTransition(toState: Int) {
        val currentState = main_activity_motion.currentState


        if(toState == currentState) {
            return
        }

//        if(toState == R.id.center_state && currentState != R.id.home_state) {
//            icon_home.performHapticFeedback(HapticFeedbackConstants.LONG_PRESS)
//        }

        main_activity_motion.setTransition(currentState, toState)
        main_activity_motion.setTransitionDuration(200)
        main_activity_motion.transitionToEnd()
    }

}
