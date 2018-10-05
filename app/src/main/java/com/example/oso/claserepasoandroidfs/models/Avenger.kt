package com.example.oso.claserepasoandroidfs.models

import android.os.Parcel
import android.os.Parcelable

class Avenger (val name: String,
               val nick: String,
               val description: String,
               val address: String,
               val abilities: String,
               val age: Int) : Parcelable {

    fun showData(): String{
        return "Bienvenido $name, desde hoy seras conocida como $nick nos alegra tener una persona " +
                "con muchas habilidades como las tuyas $abilities"
    }

    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readInt()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(nick)
        parcel.writeString(description)
        parcel.writeString(address)
        parcel.writeString(abilities)
        parcel.writeInt(age)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Avenger> {
        override fun createFromParcel(parcel: Parcel): Avenger {
            return Avenger(parcel)
        }

        override fun newArray(size: Int): Array<Avenger?> {
            return arrayOfNulls(size)
        }
    }
}