package com.example.projectbp2517

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.AdapterHome
import com.example.projectbp2517.databinding.ActivityBookKidBinding

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnMenu1:Button = findViewById(R.id.buttonMenu1)
        btnMenu1.setOnClickListener{
            val intent = Intent(this, ActivityBookKidBinding::class.java)
            startActivity(intent)
        }
        val btnMenu3:Button = findViewById(R.id.buttonMenu3)
        btnMenu3.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        val rvBuku.RecyclerView = findViewById(R.id.recycleViewBuku)
        //set layout manager di recyclerview
        rvBuku.layoutManager = LinearLayoutManager(this)
        //list data buku
        val data = ArrayList<BukuModel>()
        data.add(BukuModel(R.drawable.book1, "Emi's Beach Adventure",
                    "Lorem ipsum dolor sit amet lorem ipsum dolor set amet"))
        data.add(BukuModel(R.drawable.book2, "Ade's Adventure",
            "Lorem ipsum dolor sit amet lorem ipsum dolor set amet"))
        data.add(BukuModel(R.drawable.book4, "Mermaid To Rescue",
            "Lorem ipsum dolor sit amet lorem ipsum dolor set amet"))
        //set adapter
        val adapter = AdapterHome(data)
        //set adapter ke recycler view
        rvBuku.adapter = adapter

    }
}