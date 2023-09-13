package com.example.lifecycle

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MyFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MyFragment", "onCreate 호출")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my, container, false)
    }

    override fun onStart() {
        super.onStart()
        Log.d("MyFragment", "onStart 호출")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MyFragment", "onResume 호출")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MyFragment", "onPause 호출")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyFragment", "onStop 호출")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("MyFragment", "onDestroyView 호출")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyFragment", "onDestroy 호출")
    }
}