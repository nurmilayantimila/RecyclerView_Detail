package com.example.mysubmission_dicoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {




    private lateinit var rvKuliner : RecyclerView
    private var list : ArrayList<kuliner> = arrayListOf()
    private var titlee= "Kuliner Sulsel"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setActionBarTitle(titlee)
        setContentView(R.layout.activity_main)

        rvKuliner= findViewById(R.id.rv_kuliner)
        rvKuliner.setHasFixedSize(true)


        list.addAll(KulinerData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvKuliner.layoutManager= LinearLayoutManager(this)
        val kulinerAdapter = kulinerAdapter(list)
        rvKuliner.adapter= kulinerAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setActionBarTitle (title: String) {
        supportActionBar?.title=title
    }

    private fun setMode(itemId: Int) {
        when(itemId){
            R.id.about->{
                startActivity(Intent(this@MainActivity, AboutMe::class.java))

            }

        }
    }

}