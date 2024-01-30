package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    private lateinit var displayTextView: TextView
    private lateinit var nameEditText: EditText
    private lateinit var clickMeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with views defined in Layout - the first one is done for you
        displayTextView = findViewById(R.id.displayTextView)
        nameEditText = findViewById(R.id.nameEditText)
        clickMeButton = findViewById(R.id.clickMeButton)

        clickMeButton.setOnClickListener(::onClickMeButtonClicked)

        /*
        clickMeButton.setOnClickListener {
            v: View? ->
            val name = nameEditText.text.toString()
            val displayTextString = "Hello, $name"
            displayTextView.text = displayTextString
         }
         */

        
        // Respond to button click event per specifications
    }

    private fun onClickMeButtonClicked(v: View?) {
        val name = nameEditText.text.toString()
        val displayTextString = "Hello, $name"
        displayTextView.text = displayTextString
    }
}