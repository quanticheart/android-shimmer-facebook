package com.example.shimmerfacebookeffect

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    /**
     * https://github.com/facebook/shimmer-android
     */
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        shimmer.startShimmer()
        counter(3) {
            flipper.displayedChild = 1
        }
    }
}
