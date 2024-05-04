package com.hokari.customer.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class User(
    val email: String = "",
    val firstName: String = "",
    val gender: String = "",
    val id: String = "",
    val image: String = "",
    val lastName: String = "",
    val mobile: Long = 0,
    val profileCompleted: Int = 0,
    val type: String = ""
) : Parcelable
