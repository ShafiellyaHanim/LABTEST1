package com.example.mindsharpener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getSupportActionBar().setTitle("Mind Sharpener");

    }

    fun onRadioButtonClicked(view: View) {
        if (view is RadioGroup) {
            // Is the button now checked?
            val checked = view.isClickable

            // Check which radio button was clicked
            when (view.getId()) {
                R.id.rb1 ->
                    if (checked) {
                        // Pirates are the best
                    }
                R.id.rb2 ->
                    if (checked) {
                        // Ninjas rule
                    }
                R.id.rb3 ->
                    if (checked) {
                        // Ninjas rule
                    }
            }
        }

    }
}


