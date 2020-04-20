package ie.wit.diyp.main

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ie.wit.diyp.R
import ie.wit.diyp.models.DIYPMemStore
import ie.wit.diyp.models.DIYPStore

class DIYPApp : Application() {

    lateinit var ordersStore: DIYPStore

    override fun onCreate() {
        super.onCreate()
        ordersStore = DIYPMemStore()
        Log.v("Order","DIYP started")

    }
}
