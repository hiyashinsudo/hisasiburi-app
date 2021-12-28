package com.example.hisasiburi2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hisasiburi2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Button切り替え用のフラグ
        var flag = false

        binding.button.setOnClickListener {
            if (flag) {
                // flagがtrueの時
                binding.textView.text = getString(R.string.mei1)
                flag = false
            } else {
                // flagがfalseの時
                binding.textView.text = getString(R.string.mei2)
                flag = true
            }
        }
    }
}