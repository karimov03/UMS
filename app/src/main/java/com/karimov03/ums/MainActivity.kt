package com.karimov03.ums

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.karimov03.ums.Fragments.HomeFragment
import com.karimov03.ums.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

