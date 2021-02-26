package com.example.mysubmission_dicoding

import android.app.VoiceInteractor
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class kulinerAdapter (private val listKuliner : ArrayList<kuliner>) : RecyclerView.Adapter<kulinerAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){
        var tvName: TextView= itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView= itemView.findViewById(R.id.tv_item_detail)
        var image: ImageView= itemView.findViewById(R.id.img_item_photo)

    }


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): kulinerAdapter.ListViewHolder {
        val view : View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_kuliner, viewGroup, false)
        return ListViewHolder(view)

    }

    override fun getItemCount(): Int {
        return listKuliner.size
    }

    override fun onBindViewHolder(holder: kulinerAdapter.ListViewHolder, position: Int) {
        val kuliner =  listKuliner[position]

        Glide.with(holder.itemView.context)
            .load(kuliner.img)
            .apply(RequestOptions().override(100, 100))
            .into(holder.image)

        holder.tvName.text= kuliner.name
        holder.tvDetail.text= kuliner.detail

        holder.itemView.setOnClickListener {
            val context=holder.itemView.context
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra(DetailActivity.nama_, kuliner.name)
            intent.putExtra(DetailActivity.gambar_, kuliner.img)
            intent.putExtra(DetailActivity.detail, kuliner.detail)
            intent.putExtra(DetailActivity.kng, kuliner.kandunganGizi)
            intent.putExtra(DetailActivity.jumlahgzi, kuliner.jumlahGizi)
            intent.putExtra(DetailActivity.caraMembuat, kuliner.caraMembuat)
            context.startActivity(intent)


        }

    }

}


