package com.mbobiosio.datastructures.sort

import java.util.*

/*
* Created by Mbuodile Obiosio on Jun 26, 2021.
* Twitter: @cazewonder
* Nigeria
*/
class InsertSort {

    /*
     * Insertion sort compares the current element with the element on the left.
     * If it is found to be smaller it is swapped with the element on the left.
     * Worst Case Time Complexity : O(n2)
     * Best Case Time Complexity : O(n)
     * Average Time Complexity : O(n2)
     * Space Complexity : O(1)
     * This makes it inefficient to operate on larger datasets
     * */
    private fun insertionSort(arr: IntArray): IntArray? {
        if (arr.size == 1) return arr
        for (i in 1 until arr.size) {
            for (j in i downTo 1) {
                if (arr[j] < arr[j - 1]) {
                    val temp = arr[j]
                    arr[j] = arr[j - 1]
                    arr[j - 1] = temp
                }
            }
        }
        return arr
    }

    fun main(args: Array<String>) {
        val arr = intArrayOf(55, 23, 26, 2, 25)
        print(Arrays.toString(insertionSort(arr)))
    }
}