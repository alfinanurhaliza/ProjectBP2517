package com.example.projectbp2517

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.projectbp2517.databinding.ActivityAboutBinding
import com.example.projectbp2517.databinding.ActivityBookKidBinding

class BookKidActivity : AppCompatActivity() {
    lateinit var binding: ActivityBookKidBinding

    private fun replaceFragment(frg:Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragmentKidBook,frg)
        fragmentTrx.commit()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookKidBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //even saat button fairy di klik
        binding.buttonFairy.setOnClickListener{
            replaceFragment(FairyFragment())
        }

        //even saat button Fable di klik
        binding.buttonFable.setOnClickListener{
            replaceFragment(FableFragment())
        }

        //even saat button Science di Klik
        binding.buttonScience.setOnClickListener{
            replaceFragment(ScienceFragment())
        }
        setContentView(R.layout.activity_book_kid)
    }
}