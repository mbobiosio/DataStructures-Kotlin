package com.mbobiosio.datastructures.search

/*
* Created by Mbuodile Obiosio on Jun 26, 2021.
* Twitter: @cazewonder
* Nigeria
*/
class BinarySearch {

    /*
     * Binary Search using recursion
     * Time complexity - Olog(n)
     * Memory Complexity - O(logn) - as it will consume memory on the stack
     * */
    private fun recursiveBinarySearch(arr: IntArray, n: Int, low: Int, high: Int): Int {
        if (low > high) {
            return -1
        }
        val middle = low + (high - low) / 2
        return when {
            arr[middle] == n -> middle
            n > arr[middle] -> {
                recursiveBinarySearch(arr, n, middle + 1, high)
            }
            else -> recursiveBinarySearch(arr, n, low, middle - 1)
        }
    }


    /*
     * Binary Search using iteration
     * Time complexity - Olog(n)
     * Memory Complexity - Constant, O(1)
     * */
    private fun iterativeBinarySearch(arr: IntArray, n: Int, low: Int, high: Int): Int {
        var oldLow = low
        var oldHigh = high
        while (oldLow <= oldHigh) {
            val middle = oldLow + (oldHigh - oldLow) / 2
            if (arr[middle] == n) return middle
            if (n > arr[middle]) {
                oldLow = middle + 1
            } else {
                oldHigh = middle - 1
            }
        }
        return -1
    }

    fun main(args: Array<String>) {
        val arr = intArrayOf(1, 11, 23, 34, 45, 56, 67, 78, 89, 90)
        val n = 90
        println(recursiveBinarySearch(arr, n, 0, arr.size - 1))
        println(iterativeBinarySearch(arr, n, 0, arr.size - 1))
    }
}