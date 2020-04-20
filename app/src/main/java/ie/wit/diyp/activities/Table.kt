package ie.wit.diyp.activities

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import ie.wit.diyp.R
import ie.wit.diyp.main.DIYPApp
import kotlinx.android.synthetic.main.content_default_barfood.*

class Table : AppCompatActivity() {
    lateinit var app: DIYPApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_table)


        val table1 = findViewById<TextView>(R.id.table1)
        table1.setOnClickListener{
            val intent = Intent(this, Barfood::class.java)
            startActivity(intent)
        }

        val table2 = findViewById<TextView>(R.id.table2)
        table2.setOnClickListener{
            val intent = Intent(this, Barfood::class.java)
            startActivity(intent)
        }

        val table3 = findViewById<TextView>(R.id.table3)
        table3.setOnClickListener{
            val intent = Intent(this, Barfood::class.java)
            startActivity(intent)
        }

        val table4 = findViewById<TextView>(R.id.table4)
        table4.setOnClickListener{
            val intent = Intent(this, Barfood::class.java)
            startActivity(intent)
        }

        val table5 = findViewById<TextView>(R.id.table5)
        table5.setOnClickListener{
            val intent = Intent(this, Barfood::class.java)
            startActivity(intent)
        }

        val table6 = findViewById<TextView>(R.id.table6)
        table6.setOnClickListener{
            val intent = Intent(this, Barfood::class.java)
            startActivity(intent)
        }
    }


}