package com.mbobiosio.datastructures.sort

/*
* Created by Mbuodile Obiosio on Jun 26, 2021.
* Twitter: @cazewonder
* Nigeria
*/
class BubbleSort {

    /*
     * 1. Bubble sort is the simplest sorting algorithm that compares two adjacent elements in an array and swaps the largest of the two values to  the end.
     * 2. The worst case time complexity of bubble sort is O(n2): this is because for each iteration n-1 comparisons will be done.
     * 3. The best case  time complexity will be O(n): this is when the list is already sorted
     * 4. The space time complexity will be O(1): since only one memory space is required for the temp variable.
     * */

    private fun bubbleSort(arr: IntArray): IntArray {
        if (arr.size == 1) return arr
        for (i in arr.indices) {
            for (j in i until arr.size) {
                if (arr[j] < arr[i]) {
                    val temp = arr[i]
                    arr[i] = arr[j]
                    arr[j] = temp
                }
            }
        }
        return arr
    }

    fun main(args: Array<String>) {
        val arr = intArrayOf(55, 23, 26, 2, 25)
        print(bubbleSort(arr).contentToString())
    }
}