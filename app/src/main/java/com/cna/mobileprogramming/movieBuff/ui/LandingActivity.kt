package com.cna.mobileprogramming.movieBuff.ui

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.cna.mobileprogramming.foodie.databinding.ActivityLandingBinding
import com.cna.mobileprogramming.movieBuff.adapter.MovieAdapter
import com.cna.mobileprogramming.movieBuff.viewmodel.MainViewModel

class LandingActivity : AppCompatActivity() {
    lateinit var viewModel: MainViewModel
    private val adapter = MovieAdapter()
    lateinit var binding: ActivityLandingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLandingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("button", "allMovies")
            startActivity(intent);
        }

        binding.button2.setOnClickListener{
            val intent2 = Intent(this, MainActivity::class.java)
            intent2.putExtra("button", "highRated")
            startActivity(intent2);
        }

        binding.button3.setOnClickListener{
            val intent3 = Intent(this, MainActivity::class.java)
            intent3.putExtra("button", "favorite")
            startActivity(intent3);
        }

        binding.button4.setOnClickListener{
            val intent4 = Intent(this, MainActivity::class.java)
            intent4.putExtra("button", "latest")
            startActivity(intent4);
        }


    }







}