package ie.wit.diyp.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import ie.wit.diyp.R
import ie.wit.diyp.main.DIYPApp
import ie.wit.diyp.models.DIYPModel
import kotlinx.android.synthetic.main.content_default_barfood.orderButton
import kotlinx.android.synthetic.main.content_default_barfood.toolbar
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.toast

class Barfood : AppCompatActivity(), AnkoLogger {
    lateinit var app: DIYPApp
    var order = DIYPModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_default_barfood)

        orderButton.setOnClickListener() {
            order.orderPlaced = order.toString()
            if (order.orderPlaced.isNotEmpty()) {
                info("Order Placed: $order")
            }
            else {
                toast ("Please Enter an Order")
            }
        }

        val barButton = findViewById<Button>(R.id.barButton)
        barButton.setOnClickListener{
            val intent = Intent(this, Bar::class.java)
            startActivity(intent)
        }

        val starter = findViewById<Button>(R.id.starter)
        starter.setOnClickListener{
            val intent = Intent(this, Starter::class.java)
            startActivity(intent)
        }

        val grill = findViewById<Button>(R.id.grill)
        grill.setOnClickListener{
            val intent = Intent(this, Grill::class.java)
            startActivity(intent)
        }

        val specialities = findViewById<Button>(R.id.specialities)
        specialities.setOnClickListener{
            val intent = Intent(this, Specialities::class.java)
            startActivity(intent)
        }

        val desserts = findViewById<Button>(R.id.desserts)
        desserts.setOnClickListener{
            val intent = Intent(this, Dessert::class.java)
            startActivity(intent)
        }

        val salads = findViewById<Button>(R.id.salads)
        salads.setOnClickListener{
            val intent = Intent(this, Salad::class.java)
            startActivity(intent)
        }

        val sea = findViewById<Button>(R.id.sea)
        sea.setOnClickListener{
            val intent = Intent(this, Sea::class.java)
            startActivity(intent)
        }

        val sides = findViewById<Button>(R.id.sides)
        sides.setOnClickListener{
            val intent = Intent(this, Sides::class.java)
            startActivity(intent)
        }

        val pizza = findViewById<Button>(R.id.pizza)
        pizza.setOnClickListener{
            val intent = Intent(this, Pizza::class.java)
            startActivity(intent)
        }

        val kids = findViewById<Button>(R.id.kids)
        kids.setOnClickListener{
            val intent = Intent(this, Kids::class.java)
            startActivity(intent)
        }

        val sandwiches = findViewById<Button>(R.id.sandwiches)
        sandwiches.setOnClickListener{
            val intent = Intent(this, Sandwich::class.java)
            startActivity(intent)
        }

        val teaCoffee = findViewById<Button>(R.id.teaCoffee)
        teaCoffee.setOnClickListener{
            val intent = Intent(this, Tea::class.java)
            startActivity(intent)
        }
    }
}