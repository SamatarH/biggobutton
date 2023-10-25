package edu.uw.ischool.samatar.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var pushButton: Button
    private var pushCount: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pushButton = findViewById(R.id.pushButton)
        pushButton.setOnClickListener {
            pushCount++
            updateButtonText()
        }
    }

    private fun updateButtonText() {
        val buttonText = "You have pushed me $pushCount time${if (pushCount != 1) "s" else ""}!"
        pushButton.text = buttonText
    }
}