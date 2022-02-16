package com.mbobiosio.datastructures.sort

import java.util.*

/*
* Created by Mbuodile Obiosio on Jun 26, 2021.
* Twitter: @cazewonder
* Nigeria
*/
class MergeSort {

    /*
     * Merge sort uses divide & conquer method by splitting the array into smaller parts until there is only one element.
     * The elements are then compared and sorted and merged.
     * Split the arr into half by finding the median.
     * Call mergeSort on the first half and mergeSort on the second half. Then merge the two halves.
     * The time complexity of merge sort is always O(n log n): in all 3 cases (worst, average and best) as merge sort
     * always divides the array in two halves and take linear time to merge two halves.
     * */
    private fun mergeSort(arr: IntArray, lowerIndex: Int, upperIndex: Int): IntArray {
        if (arr.size == 1) return arr
        if (lowerIndex >= upperIndex) return arr
        val median = (lowerIndex + upperIndex) / 2
        mergeSort(arr, lowerIndex, median)
        mergeSort(arr, median + 1, upperIndex)
        merge(arr, lowerIndex, median, upperIndex)
        return arr
    }

    private fun merge(arr: IntArray, lowerIndex: Int, median: Int, upperIndex: Int): IntArray? {
        val tempArr = IntArray(arr.size)
        for (i in 0..upperIndex) {
            tempArr[i] = arr[i]
        }
        var i = lowerIndex
        var j = median + 1
        var k = lowerIndex
        while (i <= median && j <= upperIndex) {
            if (tempArr[i] < tempArr[j]) {
                arr[k] = tempArr[i]
                i++
            } else {
                arr[k] = tempArr[j]
                j++
            }
            k++
        }
        while (i <= median) {
            arr[k] = tempArr[i]
            i++
            k++
        }
        return arr
    }

    fun main(args: Array<String>) {
        val arr = intArrayOf(55, 23, 26, 2, 25)
        print(Arrays.toString(mergeSort(arr, 0, arr.size - 1)))
    }
}