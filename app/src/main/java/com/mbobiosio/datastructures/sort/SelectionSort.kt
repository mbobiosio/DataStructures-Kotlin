package com.mbobiosio.datastructures.sort

import java.util.*

/*
* Created by Mbuodile Obiosio on Jun 26, 2021.
* Twitter: @cazewonder
* Nigeria
*/
class SelectionSort {

    /*
       * 1. Selection sort is the simplest sorting algorithm. It finds the smallest element in the array and swaps it with the first position in the array. Then the second smallest and swaps it with the second position etc.
       * 2. Worst Case Time Complexity : O(n2)
       * 3. Best Case Time Complexity : O(n2)
       * 4. Average Time Complexity : O(n2)
       * 5. Space Complexity : O(1)
       * This makes it inefficient to operate on larger datasets
       * */
    private fun selectionSort(arr: IntArray): IntArray? {
        if (arr.size == 1) return arr
        for (i in arr.indices) {
            var index = i
            for (j in i + 1 until arr.size) {
                if (arr[j] < arr[index]) {
                    index = j
                }
            }
            val smallestNumber = arr[index]
            arr[index] = arr[i]
            arr[i] = smallestNumber
        }
        return arr
    }

    fun main(args: Array<String>) {
        val arr = intArrayOf(55, 23, 26, 2, 25)
        print(Arrays.toString(selectionSort(arr)))
    }
}