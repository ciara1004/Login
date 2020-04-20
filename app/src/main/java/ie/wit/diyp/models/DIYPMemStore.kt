package ie.wit.diyp.models

import android.util.Log

var lastId= 0L

internal fun getId(): Long{
    return lastId++
}

class DIYPMemStore : DIYPStore {

    val orders = ArrayList<DIYPModel>()

    override fun findAll(): List<DIYPModel>{
        return orders
    }

    override fun findById(id:Long) : DIYPModel? {
        val foundOrder: DIYPModel? = orders.find { it.id == id }
        return foundOrder
    }

    override fun create(order: DIYPModel) {
        order.id = getId()
        orders.add(order)
        logAll()
    }

    fun logAll() {
        Log.v("Order","** Orders List **")
        orders.forEach { Log.v("Order","${it}") }
    }
}