package com.example.lifecycle

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "onCreate 호출")

        // 버튼 클릭 시 토스트 메시지 출력
        val showToastButton = findViewById<Button>(R.id.showToastButton)
        showToastButton.setOnClickListener {
            showToast("Hello World")
        }

        // Fragment 추가 버튼
        val addFragmentButton = findViewById<Button>(R.id.addFragmentButton)
        addFragmentButton.setOnClickListener {
            val fragment = MyFragment()
            supportFragmentManager.beginTransaction()
                .add(R.id.fragmentContainer, fragment, "myFragment")
                .commit()
        }

        // Fragment 제거 버튼
        val removeFragmentButton = findViewById<Button>(R.id.removeFragmentButton)
        removeFragmentButton.setOnClickListener {
            val fragment = supportFragmentManager.findFragmentByTag("myFragment")
            if (fragment != null) {
                supportFragmentManager.beginTransaction()
                    .remove(fragment)
                    .commit()
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart 호출")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume 호출")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause 호출")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop 호출")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy 호출")
    }
}