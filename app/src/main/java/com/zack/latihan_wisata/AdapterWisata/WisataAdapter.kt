package com.zack.latihan_wisata.AdapterWisata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.zack.latihan_wisata.ModelWisata.ModelWisata
import com.zack.latihan_wisata.R

class WisataAdapter (
    private val wisataList : List<ModelWisata>,
    private val OnItemClick : (ModelWisata) -> Unit
) : RecyclerView.Adapter<WisataAdapter.WisataViewHolder> () {

    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int): WisataViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_wisata,parent,false)
        return WisataViewHolder(view)
    }

    override fun onBindViewHolder(holder: WisataViewHolder, position: Int) {
        val wisata = wisataList[position]
        holder.bind(wisata, OnItemClick)
    }

    override fun getItemCount(): Int {
        return wisataList.size
    }

    inner class WisataViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val namaTV : TextView = itemView.findViewById(R.id.namaTV)
        val lokasiTV : TextView = itemView.findViewById(R.id.lokaiTV)
        val gambarIV : ImageView = itemView.findViewById(R.id.gambarIV)

        fun bind(wisata:ModelWisata, OnItemClick: (ModelWisata) -> Unit){
            namaTV.text = wisata.nama
            lokasiTV.text = wisata.lokasi
            gambarIV.setImageResource(wisata.gambar)

            itemView.setOnClickListener{
                OnItemClick(wisata)
            }
        }
    }
}