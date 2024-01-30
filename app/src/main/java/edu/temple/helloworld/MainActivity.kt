package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView
    lateinit var buttonClick: Button
    lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with views defined in Layout - the first one is done for you
        displayTextView = findViewById(R.id.displayTextView)
        buttonClick = findViewById(R.id.clickMeButton)
        editText = findViewById(R.id.nameEditText)

        buttonClick.setOnClickListener{
            val name = editText.text.toString();
            displayTextView.text = "Hello $name;"
        }


        
        // Respond to button click event per specifications


    }
}