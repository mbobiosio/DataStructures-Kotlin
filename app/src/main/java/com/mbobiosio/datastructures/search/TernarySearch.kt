package com.mbobiosio.datastructures.search

/*
* Created by Mbuodile Obiosio on Jun 26, 2021.
* Twitter: @cazewonder
* Nigeria
*/
class TernarySearch {

    /*
     * Ternary Search using recursion
     * Time complexity - Olog(n)
     * Memory Complexity - O(logn) - as it will consume memory on the stack
     *
     * Ternary search is a fast search algorithm which works on the principle of divide & conquer.
     * It splits an array into three smaller arrays by finding the median value in the array.
     * The two different medians are found by adding the median value to the lowerIndex and by subtracting the upperIndex
     * by the median. If the value is greater than the median then the lower bound of the array is increased and if the value is less than the median then the upper bound of the array is decreased.
     * It can be used only for sorted arrays.
     * Ternary search reduces the array into half thus reducing the count of comparisons to be made
     *
     * */
    private fun ternarySearch(n: Int, arr: IntArray, lowerIndex: Int, upperIndex: Int): Int {
        if (n < arr[lowerIndex] || n > arr[upperIndex]) return -1
        val median = (upperIndex - lowerIndex) / 3
        val med1 = lowerIndex + median
        val med2 = upperIndex - median
        if (arr[med1] == n) return med1
        if (arr[med2] == n) return med2
        if (arr[med1] < n) return ternarySearch(n, arr, med1 + 1, upperIndex)
        return if (arr[med2] > n) ternarySearch(n, arr, lowerIndex, med2 - 1) else -1
    }

    fun main(args: Array<String>) {
        val arr = intArrayOf(1, 11, 23, 34, 45, 56, 67, 78, 89, 90)
        val n = 90
        println(ternarySearch(n, arr, 0, arr.size - 1))
    }
}