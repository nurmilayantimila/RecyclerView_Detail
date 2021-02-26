package com.example.mysubmission_dicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.OnBackPressedCallback
import androidx.recyclerview.widget.LinearLayoutManager

class DetailActivity : AppCompatActivity() {

    companion object{
        const val nama_= "nama"
        const val gambar_ = "gambar"
        const val detail = "detail"
        const val kng="kandungan gizi"
        const val jumlahgzi = "jumlah gizi"
        const val caraMembuat = "cara membuat"
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val actionBar = supportActionBar
        actionBar!!.title="Kuliner Sulsel"
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)


        val image = intent.getIntExtra(gambar_, 0)
        val imagesrc = findViewById<ImageView>(R.id.img_item_photo)
        val textName = intent.getStringExtra(nama_)
        val textsrc =findViewById<TextView>(R.id.tv_item_name)
        val textDetail = intent.getStringExtra(detail)
        val detailsrc = findViewById<TextView>(R.id.tv_item_detail)
        val kandungan = intent.getStringExtra(kng)
        val kngsrc =findViewById<TextView>(R.id.kandgn_gizi)
        val jumlhGizi = intent.getStringExtra(jumlahgzi)
        val jmlhsrc = findViewById<TextView>(R.id.tv_jmlh_gizi)

        val caraMembuat = intent.getStringExtra(caraMembuat)
        val caraMembuatsrc = findViewById<TextView>(R.id.tv_cara_membuat)

        imagesrc.setImageResource(image)
        textsrc?.text= textName
        detailsrc?.text=textDetail
        kngsrc?.text=kandungan
        jmlhsrc?.text=jumlhGizi
        caraMembuatsrc?.text=caraMembuat




    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


}