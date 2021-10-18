package com.example.aibarraylistactivitybonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var BTN:Button
    lateinit var EDT:EditText
    lateinit var TV: TextView
    lateinit var EDT2:EditText
    lateinit var BTN2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var arrayname: ArrayList<String> = ArrayList()

        BTN=findViewById(R.id.thbutton)
        EDT=findViewById(R.id.theeditText)
        BTN2=findViewById(R.id.thebutton2)
        EDT2=findViewById(R.id.editText2)
        TV=findViewById(R.id.thetextView)

        var userinput: String

        BTN.setOnClickListener {

            userinput=EDT.text.toString()
            arrayname.add(userinput)
            EDT.text.clear()

        }
        var userindex: Int

        BTN2.setOnClickListener {

            userindex=EDT2.text.toString().toInt()

            TV.text=arrayname[userindex]
            EDT2.text.clear()

        }





    }
}