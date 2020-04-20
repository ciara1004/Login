package ie.wit.diyp.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import ie.wit.diyp.R



class Splash : AppCompatActivity() {
    lateinit var app: Table

    private val SPLASH_TIME_OUT:Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_splash)


        Handler().postDelayed({

            startActivity(Intent(this,Table::class.java))

            finish()
        }, SPLASH_TIME_OUT)
    }
}