package com.mbobiosio.datastructures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mbobiosio.datastructures.linkedlist.AddTwoIntegers

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //BinarySearch().main(arrayOf("1", "2", "3"))
        val a = intArrayOf(1, 5, 3, 8, 5)
        val b = intArrayOf(2, 2, 1, 7, 5)
        AddTwoIntegers().main(a, b)

    }
}