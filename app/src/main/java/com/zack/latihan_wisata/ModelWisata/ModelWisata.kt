package com.zack.latihan_wisata.ModelWisata

import android.os.Parcel
import android.os.Parcelable

data class ModelWisata(
    val nama : String,
    val lokasi : String,
    val gambar : Int,
    val taggal : String,
    val Detail : String
) : Parcelable{
    constructor(parcel: Parcel): this(
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readInt(),
        parcel.readString()?:"",
        parcel.readString()?:""
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nama)
        parcel.writeString(lokasi)
        parcel.writeInt(gambar)
        parcel.writeString(taggal)
        parcel.writeString(Detail)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ModelWisata> {
        override fun createFromParcel(parcel: Parcel): ModelWisata {
            return ModelWisata(parcel)
        }

        override fun newArray(size: Int): Array<ModelWisata?> {
            return arrayOfNulls(size)
        }
    }
}
