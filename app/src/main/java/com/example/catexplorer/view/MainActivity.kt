package com.example.catexplorer.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.catexplorer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    // TODO: add navHostFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

    }
}