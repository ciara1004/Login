package ie.wit.diyp.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import ie.wit.diyp.R
import ie.wit.diyp.main.DIYPApp
import ie.wit.diyp.models.DIYPModel
import kotlinx.android.synthetic.main.content_kids.orderButton
import kotlinx.android.synthetic.main.content_default_bar.toolbar
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.toast

class Kids : AppCompatActivity(), AnkoLogger {
    lateinit var app: DIYPApp
    var order = DIYPModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_kids)


        orderButton.setOnClickListener() {
            order.orderPlaced = order.toString()
            if (order.orderPlaced.isNotEmpty()) {
                info("Order Placed: $order")
            } else {
                toast("Please Enter an Order")
            }
        }

        val barButton = findViewById<Button>(R.id.barButton)
        barButton.setOnClickListener{
            val intent = Intent(this, Bar::class.java)
            startActivity(intent)
        }

        val barfoodButton = findViewById<Button>(R.id.barfoodButton)
        barfoodButton.setOnClickListener{
            val intent = Intent(this, Barfood::class.java)
            startActivity(intent)
        }

        val defaultMenu = findViewById<Button>(R.id.defaultMenu)
        defaultMenu.setOnClickListener{
            val intent = Intent(this, Barfood::class.java)
            startActivity(intent)
        }
    }
}