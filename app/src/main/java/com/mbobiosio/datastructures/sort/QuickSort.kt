package com.mbobiosio.datastructures.sort

import java.util.*

/*
* Created by Mbuodile Obiosio on Jun 26, 2021.
* Twitter: @cazewonder
* Nigeria
*/
class QuickSort {

    /*
     * Given an integer array, sort it in ascending order using quicksort.
     *
     * Runtime Complexity - Linearithmic, O(nlogn).
     * Memory Complexity - Logarithmic, O(logn).
     * Note: Recursive solution has O(logn) memory complexity as it will consume memory on the stack.
     *
     *
     * Step 1: Select a pivot element from the array, usually the first element
     * Step 2: Compare the pivot element with the current element. If the current element is less than the pivot,
     *         shift the current element to the left side and if it is greater than the pivot, shift it to the right
     *         side of the pivot.
     * Step 3: Recursively sort the sublists on the right and left sides of the pivot
     * */

    /*
     * Given an integer array, sort it in ascending order using quicksort.
     *
     * Runtime Complexity - Linearithmic, O(nlogn).
     * Memory Complexity - Logarithmic, O(logn).
     * Note: Recursive solution has O(logn) memory complexity as it will consume memory on the stack.
     *
     *
     * Step 1: Select a pivot element from the array, usually the first element
     * Step 2: Compare the pivot element with the current element. If the current element is less than the pivot,
     *         shift the current element to the left side and if it is greater than the pivot, shift it to the right
     *         side of the pivot.
     * Step 3: Recursively sort the sublists on the right and left sides of the pivot
     * */
    fun quickSort(arr: IntArray, low: Int, high: Int): IntArray? {
        if (high > low) {
            val partitionIndex = partition(arr, low, high)
            quickSort(arr, low, partitionIndex - 1)
            quickSort(arr, partitionIndex + 1, high)
        }
        return arr
    }

    private fun partition(arr: IntArray, low: Int, high: Int): Int {
        val pivot = arr[low]
        var i = low
        var j = high
        while (i < j) {
            while (i <= high && arr[i] <= pivot) {
                i++
            }
            while (arr[j] > pivot) {
                j--
            }
            if (i < j) {
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            } else break
        }
        arr[low] = arr[j]
        arr[j] = pivot
        return j
    }

    fun main(args: Array<String>) {
        val arr = intArrayOf(55, 23, 26, 2, 25)
        print(Arrays.toString(quickSort(arr, 0, arr.size - 1)))
    }
}