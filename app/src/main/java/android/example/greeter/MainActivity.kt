package android.example.greeter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var name_editText: EditText
    lateinit var greet_btn:Button
    lateinit var name_textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        greetUser()
    }

    private fun greetUser() {
        name_editText = findViewById(R.id.name_editText)
        greet_btn = findViewById(R.id.greet_btn)
        name_textView = findViewById(R.id.name_textView)

        greet_btn.setOnClickListener {
            val name = name_editText.text
            if (name.isEmpty()){
                Toast.makeText(this, "please, enter your name", Toast.LENGTH_LONG).show()
            } else {
                name_textView.text = "Hello, $name"
            }
        }
    }
}