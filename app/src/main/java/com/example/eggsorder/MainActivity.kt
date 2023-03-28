package com.example.eggsorder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var entryField: TextView? = null
    private var eggResult: TextView? = null
    var entryValue = 0

    fun eggCalculation(entryField: Int) {
        val grossEggs: Int = entryField / 144
        val grossRemainder: Int = entryField % 144
        val dozenEggs: Int = grossRemainder / 12
        val singleEggs: Int = entryField % 12

        val eggPrint: String = "There are $grossEggs gross, $dozenEggs dozen and $singleEggs eggs."
        eggResult?.text = eggPrint
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        entryField = findViewById(R.id.entryField)
        eggResult = findViewById(R.id.eggResult)

        var btnEnter = findViewById<Button>(R.id.btnEnter)
        var btnDelete = findViewById<Button>(R.id.btnDelete)

        btnEnter.setOnClickListener {
            eggCalculation(entryValue)
        }

        btnDelete.setOnClickListener {
            entryValue = 0
            entryField?.text = "0"
            eggResult?.text = "There are 0 gross, 0 dozen and 0 eggs."
        }

        var btn1 = findViewById<Button>(R.id.btnOne)
        btn1.setOnClickListener { updateNumpadPressed(it) }
        var btn2 = findViewById<Button>(R.id.btnTwo)
        btn2.setOnClickListener { updateNumpadPressed(it) }
        var btn3 = findViewById<Button>(R.id.btnThree)
        btn3.setOnClickListener { updateNumpadPressed(it) }
        var btn4 = findViewById<Button>(R.id.btnFour)
        btn4.setOnClickListener { updateNumpadPressed(it) }
        var btn5 = findViewById<Button>(R.id.btnFive)
        btn5.setOnClickListener { updateNumpadPressed(it) }
        var btn6 = findViewById<Button>(R.id.btnSix)
        btn6.setOnClickListener { updateNumpadPressed(it) }
        var btn7 = findViewById<Button>(R.id.btnSeven)
        btn7.setOnClickListener { updateNumpadPressed(it) }
        var btn8 = findViewById<Button>(R.id.btnEight)
        btn8.setOnClickListener { updateNumpadPressed(it) }
        var btn9 = findViewById<Button>(R.id.btnNine)
        btn9.setOnClickListener { updateNumpadPressed(it) }
        var btn0 = findViewById<Button>(R.id.btnZero)
        btn0.setOnClickListener { updateNumpadPressed(it) }


    }

    private fun updateNumpadPressed(v: View) {
        entryValue = entryValue * 10 + ((v as Button).text).toString().toInt()
        entryField?.text = entryValue.toString()
    }
}