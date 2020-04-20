package ie.wit.diyp.main

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import ie.wit.diyp.R
import kotlinx.android.synthetic.main.content_default_bar.*


class Login : AppCompatActivity(), View.OnClickListener {
    lateinit var app: DIYPApp


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_login)
        setSupportActionBar(toolbar)
    }
    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}