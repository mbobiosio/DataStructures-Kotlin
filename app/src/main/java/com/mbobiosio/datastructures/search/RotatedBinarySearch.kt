package com.mbobiosio.datastructures.search

/*
* Created by Mbuodile Obiosio on Jun 26, 2021.
* Twitter: @cazewonder
* Nigeria
*/
class RotatedBinarySearch {

    /*
     * Binary Search using recursion
     * Time complexity - Olog(n)
     * Memory Complexity - O(logn) - as it will consume memory on the stack
     * */
    private fun rotatedBinarySearch(arr: IntArray, n: Int, low: Int, high: Int): Int {
        if (low > high) return -1
        val middle = low + (high - low) / 2
        if (arr[middle] == n) return middle

        /*
         * Step 1: check if the n value is less than the middle value
         * Step 2: Check if the first value is less than the middle value
         * Step 3: Check if the first value is less than the n value
         * */if (n < arr[middle] && arr[low] < arr[middle] && n >= arr[low]) {
            return rotatedBinarySearch(arr, n, low, middle - 1)

            /*
         * Step 1: check if the n value is greater than the middle value
         * Step 2: Check if the middle value is less than the highest value
         * Step 3: Check if the highest value is <= the n value
         * */
        } else if (n > arr[middle] && arr[middle] < arr[high] && n <= arr[high]) {
            return rotatedBinarySearch(arr, n, middle + 1, high)

            /*
         * Step 1: check if the first value is greater than the middle value
         * */
        } else if (arr[low] > arr[middle]) {
            return rotatedBinarySearch(arr, n, low, middle - 1)

            /*
         * Step 1: check if the last value is less than the middle value
         * */
        } else if (arr[high] < arr[middle]) {
            return rotatedBinarySearch(arr, n, middle + 1, high)
        }
        return -1
    }

    fun main(args: Array<String>) {
        val arr = intArrayOf(5, 6, 7, 8, 9, 10, 1, 2, 3)
        val n = 3
        println(rotatedBinarySearch(arr, n, 0, arr.size - 1))
    }
}