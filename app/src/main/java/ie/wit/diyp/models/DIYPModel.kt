package ie.wit.diyp.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DIYPModel(var id: Long = 0,
                     var orderPlaced: String = "",
                     val amount: Int = 0) : Parcelable