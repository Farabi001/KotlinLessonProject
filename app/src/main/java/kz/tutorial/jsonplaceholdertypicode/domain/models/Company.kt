package kz.tutorial.jsonplaceholdertypicode.domain.models


import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Company(
    val bs: String,
    val catchPhrase: String,
    val name: String
) : Parcelable